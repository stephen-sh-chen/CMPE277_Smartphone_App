package hw4.cmpe277.com.hw4_th_sensor_driver;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements UIUpdateCallBack {
    private EditText getTempUI = null;
    private EditText getHumiUI = null;
    private EditText getActUI = null;
    private EditText getReadCountUI = null;
    private EditText getOutputUI = null;
    public  TextView getGenerate = null;
    private TextView getCancle = null;
    private int readCount = 0;
    private MyLongTask mLongTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTempUI = (EditText) findViewById(R.id.IdTemperature);
        getHumiUI = (EditText) findViewById(R.id.IdHumidity);
        getActUI = (EditText) findViewById(R.id.IdActivityId);
        getReadCountUI = (EditText) findViewById(R.id.IdSensortReadCount);
        getOutputUI = (EditText) findViewById(R.id.IdOutputArea);
        getGenerate = (TextView) findViewById(R.id.IdGenerate);
        getCancle = (TextView) findViewById(R.id.IdCancel);

        getTempUI.setFocusable(false);
        getHumiUI.setFocusable(false);
        getActUI.setFocusable(false);
        getOutputUI.setFocusable(false);
    }

    @Override
    public void UpdateUI(int temp, int humi, int actId, int counter) {
        getTempUI.setText(temp + "");
        getHumiUI.setText(humi + "");
        getActUI.setText(actId + "");
        getReadCountUI.setText(readCount - counter + "");

        StringBuilder sb = new StringBuilder();
        sb.append("Output ").append(counter + ":\n");
        sb.append("Temperature: ").append(temp + " F\n");
        sb.append("Humidity: ").append(humi + " %\n");
        sb.append("Activity: ").append(actId + " \n\n");
        getOutputUI.append(sb.toString());
    }

    public void Generate(View view) {
        this.readCount = Integer.parseInt(getReadCountUI.getText().toString());
        getTempUI.setText("");
        getHumiUI.setText("");
        getActUI.setText("");
        getOutputUI.setText("");

        mLongTask = new MyLongTask(MainActivity.this);
        mLongTask.execute(readCount);
    }

    public void Cancel(View view) {
        mLongTask.cancel(true);
        getGenerate.setClickable(true);
        Toast.makeText(this, "The Async Task Stopped!", Toast.LENGTH_SHORT).show();
    }
}
