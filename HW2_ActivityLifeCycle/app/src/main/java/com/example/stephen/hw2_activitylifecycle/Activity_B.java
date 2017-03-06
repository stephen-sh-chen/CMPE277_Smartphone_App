package com.example.stephen.hw2_activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_B extends AppCompatActivity {

    private int threadCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__b);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        threadCount = bundle.getInt("ThreadCount");
        threadCount++;
    }

    public void finishB(View view) {
        Intent intent=new Intent(Activity_B.this, MainActivity.class);
        intent.putExtra("ThreadCount", threadCount);
        startActivity(intent);
        Activity_B.this.finish();
    }


}
