package hw4.cmpe277.com.hw4_th_sensor_driver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements UIUpdateCallBack {
    private EditText getTempUI = null;
    private EditText getHumiUI = null;
    private EditText getActUI = null;
    private EditText getReadCountUI = null;
    private EditText getOutputUI = null;
    private int readCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTempUI = (EditText) findViewById(R.id.IdTemperature);
        getHumiUI = (EditText) findViewById(R.id.IdTemperature);
        getActUI = (EditText) findViewById(R.id.IdTemperature);
        getReadCountUI = (EditText) findViewById(R.id.IdTemperature);
        getOutputUI = (EditText) findViewById(R.id.IdTemperature);
    }

    @Override
    public void UpdateUI(int temp, int humi, int actId, int counter) {
        getTempUI.setText(temp + "");
        getHumiUI.setText(humi + "");
        getActUI.setText(actId + "");
        getReadCountUI.setText(readCount - counter + "");
        getOutputUI.setText(humi + "");
    }

    public void Generate(View view) {
        this.readCount = Integer.parseInt(getReadCountUI.getText().toString());
    }

    public void Cancel(View view) {

    }
}
