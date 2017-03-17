package hw4.cmpe277.com.hw4_th_sensor_driver;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Stephen on 3/17/2017.
 */

public class MyLongTask extends AsyncTask<Integer, Integer, Integer> {
    UIUpdateCallBack mUICallBack = null;

    public MyLongTask(UIUpdateCallBack callBack) {
        mUICallBack = callBack;
    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected Integer doInBackground(Integer... params) {
        int count = params[0];
        Random r = new Random();
        for (int i = 1; i <= count; i++) {
            int tempVal = r.nextInt(101);
            int humiVal = r.nextInt(101);
            int actId = r.nextInt(1000);
            publishProgress(tempVal, humiVal, actId, i);
            Utils.sleepForInSecs(5);
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... params) {
        this.mUICallBack.UpdateUI(params[0], params[1], params[2], params[3]);
        Toast.makeText((Context) mUICallBack, "Got Output " + params[3], Toast.LENGTH_SHORT).show();
    }

    protected void onPostExecute(Integer... params) {

    }
}
