package hw5.cmpe277.com.hw5_android_datastorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchItemActivity extends AppCompatActivity {

    private EditText _SearchKeywordUI = null;
    private EditText _OutputResultUI = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);

        _SearchKeywordUI = (EditText) findViewById(R.id.SearchKeywordID);
        _OutputResultUI = (EditText) findViewById(R.id.IdOutputArea);
    }

    public void Search(View view) {
        _OutputResultUI.setText("");
        String keyword = _SearchKeywordUI.getText().toString();

        DataController dataController=new DataController(getBaseContext());
        dataController.open();
        _OutputResultUI.setText(dataController.search(keyword));
        dataController.close();
    }

    public void Cancel(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
