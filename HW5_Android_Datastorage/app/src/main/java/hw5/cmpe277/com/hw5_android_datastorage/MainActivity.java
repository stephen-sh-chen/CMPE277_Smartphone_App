package hw5.cmpe277.com.hw5_android_datastorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenInsertActivity(View view) {
        Intent insertIntent = new Intent(this, AddItemActivity.class);
        startActivity(insertIntent);
    }

    public void OpenSearchActivity(View view) {
        Intent searchIntent = new Intent(this, SearchItemActivity.class);
        startActivity(searchIntent);
    }
}
