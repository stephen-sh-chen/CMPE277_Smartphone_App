package hw5.cmpe277.com.hw5_android_datastorage;

import android.provider.BaseColumns;

/**
 * Created by Stephen on 4/1/2017.
 */

public interface DbConstants extends BaseColumns{
    public static final String TABLE_NAME = "products";
    public static final String NAME = "name";
    public static final String Description = "description";
    public static final String Price = "price";
    public static final String Review = "review";
}
