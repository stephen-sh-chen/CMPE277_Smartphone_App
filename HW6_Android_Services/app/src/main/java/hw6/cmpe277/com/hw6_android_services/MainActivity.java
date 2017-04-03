package hw6.cmpe277.com.hw6_android_services;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchDownloadPage(View view) {
        Intent insertIntent = new Intent(this, DownloadActivity.class);
        startActivity(insertIntent);
    }
}
