package com.example.stephen.hw3_farm_iot_manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    private String TEMPERATURE = "Temperature";
    private String HUMIDITY = "Humidity";

    @Override
    public void onReceive(Context context, Intent intent) {
        int tempVal = intent.getExtras().getInt(TEMPERATURE);
        int humidVal = intent.getExtras().getInt(HUMIDITY);
        Intent broadcastIntent = null;
        if (tempVal >= 70 && tempVal <= 90) {
            broadcastIntent = new Intent("com.sjsu.cmpe277.intent.FANON");
            Log.i("receiver", "tempVal > 70 && tempVal < 90 => FAN ON");
        } else if (tempVal > 90) {
            broadcastIntent = new Intent("com.sjsu.cmpe277.intent.FANSPRINKLERON");
            Log.i("receiver", "tempVal > 90 => FAN and SPRINKLER All ON");
        } else {
            broadcastIntent = new Intent("com.sjsu.cmpe277.intent.FANSPRINKLEROFF");
            Log.i("receiver", "tempVal < 70 => FAN and SPRINKLER OFF");
        }
        context.sendBroadcast(broadcastIntent);
    }
}
