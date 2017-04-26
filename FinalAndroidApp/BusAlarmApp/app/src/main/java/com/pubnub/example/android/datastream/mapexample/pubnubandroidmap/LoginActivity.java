package com.pubnub.example.android.datastream.mapexample.pubnubandroidmap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private Spinner mBusLineSpinner;
    private Spinner mFromStopSpinner;
    private Spinner mEndStopSpinner;
    private ArrayAdapter<CharSequence> adapterBusLine;
    private ArrayAdapter<CharSequence> adapterFromStop;
    private ArrayAdapter<CharSequence> adapterEndStop;

    private String mBusLine = "";
    private String mFromStop = "";
    private String mEndStop = "";

    private LatLng mFromLatLng;
    private LatLng mEndLatLng;

    private Map<String, LatLng> mStopMap = createMap();
    private static Toast toast;

    private static void makeTextAndShow(final Context context, final String text, final int duration) {
        if (toast == null) {
            toast = android.widget.Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
            toast.setDuration(duration);
        }
        toast.show();
    }


    private static Map<String, LatLng> createMap()
    {
        Map<String, LatLng> myMap = new HashMap<>();
        myMap.put("Palo Alto", new LatLng(37.4473, -122.12179));
        myMap.put("Mountain View", new LatLng(37.41683, -122.0869));
        myMap.put("Sunny Valley", new LatLng(37.40809, -122.06867));
        myMap.put("Santa Clara", new LatLng(37.39971, -122.0354));
        myMap.put("San Jose", new LatLng(37.40373, -122.02285));
        myMap.put("Milpitas", new LatLng(37.41854, -121.9701));
        myMap.put("East Bridge", new LatLng(37.42267, -121.92585));
        myMap.put("Great Mall", new LatLng(37.4294, -121.9097));
        return myMap;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBusLineSpinner = (Spinner) findViewById(R.id.busLine);
        mFromStopSpinner = (Spinner) findViewById(R.id.fromStop);
        mEndStopSpinner = (Spinner) findViewById(R.id.endStop);

        adapterBusLine = ArrayAdapter.createFromResource(this, R.array.bus_line_name, android.R.layout.simple_spinner_dropdown_item);
        mBusLineSpinner.setAdapter(adapterBusLine);
        mBusLineSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT).show();
                makeTextAndShow(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT);
                mBusLine = parent.getItemAtPosition(position)+"";
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        adapterFromStop = ArrayAdapter.createFromResource(this, R.array.stop_name, android.R.layout.simple_spinner_dropdown_item);
        mFromStopSpinner.setAdapter(adapterFromStop);
        mFromStopSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT).show();
                makeTextAndShow(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT);
                mFromStop = parent.getItemAtPosition(position)+"";
                mFromLatLng = mStopMap.get(mFromStop);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        adapterEndStop = ArrayAdapter.createFromResource(this, R.array.stop_name, android.R.layout.simple_spinner_dropdown_item);
        mEndStopSpinner.setAdapter(adapterEndStop);
        mEndStopSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT).show();
                makeTextAndShow(getBaseContext(), parent.getItemAtPosition(position) + " Selcted!", Toast.LENGTH_SHORT);
                mEndStop = parent.getItemAtPosition(position)+"";
                mEndLatLng = mStopMap.get(mEndStop);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void joinChat(View view) {
        //String username = mUsername.getText().toString();

        /*if (!isValid(username)) {
            return;
        }

        SharedPreferences sp = getSharedPreferences(MainActivity.DATASTREAM_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(MainActivity.DATASTREAM_UUID, username);
        edit.apply();*/

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private static boolean isValid(String username) {
        return username.matches("^[a-zA-Z0-9_]+$");
    }

    public void go2Map(View view) {
        Intent mapIntent = new Intent(this, MainActivity.class);

        Bundle args = new Bundle();
        args.putString("BusLine", mBusLine);
        args.putString("FromStop", mFromStop);
        args.putString("EndStop", mEndStop);
        args.putParcelable("FromStopLatlng", mFromLatLng);
        args.putParcelable("EndStopLatlng", mEndLatLng);
        mapIntent.putExtra("bundle", args);
        startActivity(mapIntent);
    }
}
