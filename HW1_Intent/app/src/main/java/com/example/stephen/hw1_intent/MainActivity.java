package com.example.stephen.hw1_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText url;
    private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url=(EditText)findViewById(R.id.editText);
        phone=(EditText)findViewById(R.id.editText2);
    }

    protected void btnLaunchURL(View view) {
        Uri Url=Uri.parse(url.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW,Url);
        startActivity(intent);
    }

    protected void btnDailPhone(View view) {
        Uri tel=Uri.parse("tel:"+phone.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL,tel);
        startActivity(intent);
    }

    protected void btnCloseApp(View view) {
        MainActivity.this.finish();
    }
}
