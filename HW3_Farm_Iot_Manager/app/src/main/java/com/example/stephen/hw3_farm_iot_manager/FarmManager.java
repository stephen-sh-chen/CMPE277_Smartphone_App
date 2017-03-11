package com.example.stephen.hw3_farm_iot_manager;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FarmManager extends AppCompatActivity {

    private MyReceiver receiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_manager);

        IntentFilter intentFilter = new IntentFilter("com.sjsu.cmpe277.intent.TempHumidity");
        receiver = new MyReceiver();
        this.registerReceiver(receiver, intentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    public void TurnFan(View view) {
        Intent broadcastIntent = new Intent("com.sjsu.cmpe277.intent.FANOFF");
        sendBroadcast(broadcastIntent);
        Toast.makeText(this, "Turn Fan Off!", Toast.LENGTH_SHORT).show();
    }

    public void TurnFanSprinkler(View view) {
        Intent broadcastIntent = new Intent("com.sjsu.cmpe277.intent.FANSPRINKLEROFF");
        sendBroadcast(broadcastIntent);
        Toast.makeText(this, "Turn Fan and Sprinkler Off!", Toast.LENGTH_SHORT).show();
    }
}
