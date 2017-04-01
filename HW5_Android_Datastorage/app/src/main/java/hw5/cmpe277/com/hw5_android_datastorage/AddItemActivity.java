package hw5.cmpe277.com.hw5_android_datastorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    }
}
