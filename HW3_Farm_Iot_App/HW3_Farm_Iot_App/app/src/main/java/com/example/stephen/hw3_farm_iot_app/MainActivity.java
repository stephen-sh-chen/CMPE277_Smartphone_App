package com.example.stephen.hw3_farm_iot_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText refInputTextHumi = null;
    private EditText refInputTextTemp = null;
    private final String TEMPERATURE = "Temperature";
    private final String HUMIDITY = "Humidity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refInputTextHumi = (EditText) findViewById(R.id.InputTextHumi);
        refInputTextTemp = (EditText) findViewById(R.id.InputTextTemp);
    }

    public void Cancel(View view) {
        refInputTextHumi.setText("");
        refInputTextTemp.setText("");
    }

    public void SetConfiguration(View view) {
        String temperature = refInputTextTemp.getText().toString();
        String humidity = refInputTextHumi.getText().toString();

        if (temperature.isEmpty() || humidity.isEmpty()) {
            Toast.makeText(this, "Please fill a value in both fileds!", Toast.LENGTH_SHORT).show();
        } else {
            // Broadcast Intent
            Intent bi = new Intent();
            bi.setAction("com.sjsu.cmpe277.intent.TempHumidity");
            bi.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            bi.putExtra(TEMPERATURE, Integer.parseInt(temperature));
            bi.putExtra(HUMIDITY, Integer.parseInt(humidity));
            Log.i("sender", "sendertempVal > 70 && tempVal < 90 => FAN ON");
            sendBroadcast(bi);
            Toast.makeText(this, "Broadcaset Intent Sent!", Toast.LENGTH_SHORT).show();
        }
    }
}
