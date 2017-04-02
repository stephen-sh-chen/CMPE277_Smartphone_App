package hw5.cmpe277.com.hw5_android_datastorage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Description;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.NAME;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Price;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Review;

import java.io.OutputStreamWriter;
import java.util.Date;

public class AddItemActivity extends AppCompatActivity {

    private EditText _itemNameUI = null;
    private EditText _itemDescriptionUI = null;
    private EditText _itemPriceUI = null;
    private EditText _itemReviewUI = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        _itemNameUI = (EditText) findViewById(R.id.ItemNameId);
        _itemDescriptionUI = (EditText) findViewById(R.id.ItemDescriptionID);
        _itemPriceUI = (EditText) findViewById(R.id.ItemPriceID);
        _itemReviewUI = (EditText) findViewById(R.id.ItemReviewID);
    }

    public void cancel(View view) {
        _itemNameUI.setText("");
        _itemDescriptionUI.setText("");
        _itemPriceUI.setText("");
        _itemReviewUI.setText("");
    }

    public void save(View view) {

        DataController dataController=new DataController(getBaseContext());
        dataController.open();
        ContentValues values = new ContentValues();
        values.put(NAME, _itemNameUI.getText().toString());
        values.put(Description, _itemDescriptionUI.getText().toString());
        values.put(Price, _itemPriceUI.getText().toString());
        values.put(Review, _itemReviewUI.getText().toString());
        long retValue= dataController.insert(values);
        dataController.close();

        if (retValue != -1) {
            Context context = getApplicationContext();
            CharSequence text=getString(R.string.Save_success_msg);
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
