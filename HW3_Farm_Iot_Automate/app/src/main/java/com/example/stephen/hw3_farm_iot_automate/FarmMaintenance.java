package com.example.stephen.hw3_farm_iot_automate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FarmMaintenance extends AppCompatActivity {

    private TextView fanStatus = null;
    private TextView sprinklerStatus = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_maintenance);
        fanStatus = (TextView) findViewById(R.id.FanStatus);
        sprinklerStatus = (TextView) findViewById(R.id.SprinklerStatus);

        IntentFilter itf = new IntentFilter();
        itf.addAction("com.sjsu.cmpe277.intent.FANON");
        itf.addAction("com.sjsu.cmpe277.intent.FANSPRINKLERON");
        itf.addAction("com.sjsu.cmpe277.intent.FANOFF");
        itf.addAction("com.sjsu.cmpe277.intent.FANSPRINKLEROFF");
        MyReceiver receiver = new MyReceiver();
        registerReceiver(receiver, itf);

        fanStatus.setText(getString(R.string.FanOff));
        sprinklerStatus.setText(getString(R.string.SprinklerOff));
    }

    private class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.sjsu.cmpe277.intent.FANON")) {
                fanStatus.setText(getString(R.string.FanOn));
                Log.i("automate", "FanOn received!");
            } else if (intent.getAction().equals("com.sjsu.cmpe277.intent.FANSPRINKLERON")) {
                fanStatus.setText(getString(R.string.FanOn));
                sprinklerStatus.setText(getString(R.string.SprinklerOn));
                Log.i("automate", "FanOn and SprinkerlerOn received!");
            } else if (intent.getAction().equals("com.sjsu.cmpe277.intent.FANOFF")) {
                fanStatus.setText(getString(R.string.FanOff));
                Log.i("automate", "FanOff received!");
            } else if (intent.getAction().equals("com.sjsu.cmpe277.intent.FANSPRINKLEROFF")) {
                fanStatus.setText(getString(R.string.FanOff));
                sprinklerStatus.setText(getString(R.string.SprinklerOff));
                Log.i("automate", "FanOff and SprinkerlerOff received!");
            }
        }
    }
}
