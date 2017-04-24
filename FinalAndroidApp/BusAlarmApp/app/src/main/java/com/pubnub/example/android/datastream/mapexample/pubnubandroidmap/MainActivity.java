package com.pubnub.example.android.datastream.mapexample.pubnubandroidmap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.common.base.Throwables;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    public static final String TAG = MainActivity.class.getName();

    public static final String DATASTREAM_PREFS = "com.pubnub.example.android.datastream.mapexample.DATASTREAM_PREFS";
    public static final String DATASTREAM_UUID = "com.pubnub.example.android.datastream.mapexample.DATASTREAM_UUID";

    public static final String PUBLISH_KEY = "pub-c-275d4bd0-6556-4125-905c-a9f365a86a37";
    public static final String SUBSCRIBE_KEY = "sub-c-ac319e2e-ee4c-11e6-b325-02ee2ddab7fe";
    public static final String CHANNEL_NAME = "All_Bus_Info";

    private GoogleMap mMap;

    private PubNub mPubNub;

    private SharedPreferences mSharedPrefs;

    private Marker mMarker;
    private Polyline mPolyline;

    private List<LatLng> mPoints = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSharedPrefs = getSharedPreferences(DATASTREAM_PREFS, MODE_PRIVATE);
        if (!mSharedPrefs.contains(DATASTREAM_UUID)) {
            Intent toLogin = new Intent(this, LoginActivity.class);
            startActivity(toLogin);
            return;
        }

        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        initPubNub();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
    }

    private final void initPubNub() {
        PNConfiguration config = new PNConfiguration();

        config.setPublishKey(PUBLISH_KEY);
        config.setSubscribeKey(SUBSCRIBE_KEY);
        config.setSecure(true);

        this.mPubNub = new PubNub(config);

        this.mPubNub.addListener(new SubscribeCallback() {
            @Override
            public void status(PubNub pubnub, PNStatus status) {
                // no status handler for simplicity
            }

            @Override
            public void message(PubNub pubnub, PNMessageResult message) {
                try {
                    String msg = String.valueOf(message.getMessage());
                    int start = msg.indexOf("longitude") + 12;
                    int end = msg.indexOf("latitude") - 3;
                    String lng = msg.substring(start, end);
                    start = msg.indexOf("latitude") + 11;
                    end = msg.length() - 2;
                    String lat = msg.substring(start, end);
                    Log.v(TAG, "long:" + lng + ", lat:" + lat);

                    updateLocation(new LatLng(Double.parseDouble(lat), Double.parseDouble(lng)));
                } catch (Exception e) {
                    throw Throwables.propagate(e);
                }
            }

            @Override
            public void presence(PubNub pubnub, PNPresenceEventResult presence) {
                // no presence handler for simplicity
            }
        });


        this.mPubNub.subscribe().channels(Arrays.asList(CHANNEL_NAME)).execute();
    }

    private void updateLocation(final LatLng location) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPoints.add(location);

                if (MainActivity.this.mMarker != null) {
                    MainActivity.this.mMarker.setPosition(location);
                } else {
                    MainActivity.this.mMarker = mMap.addMarker(new MarkerOptions().position(location));
                }

                if (MainActivity.this.mPolyline != null) {
                    MainActivity.this.mPolyline.setPoints(mPoints);
                } else {
                    MainActivity.this.mPolyline = mMap.addPolyline(new PolylineOptions().color(Color.BLUE).addAll(mPoints));
                }

                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 15.0f));
            }
        });
    }
}
