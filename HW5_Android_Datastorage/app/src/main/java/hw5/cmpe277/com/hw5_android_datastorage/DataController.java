package hw5.cmpe277.com.hw5_android_datastorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import static android.provider.BaseColumns._ID;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Description;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.NAME;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Price;
import static hw5.cmpe277.com.hw5_android_datastorage.DbConstants.Review;

public class DataController
{
	public static final String MESSAGE="Message";
	public static final String TABLE_NAME="Msg_Table12";
	public static final String DATABASE_NAME="Assignment21.db";
	public static final int DATABASE_VERSION=4;

	DataBaseHelper dbHelper;
	Context context;
	SQLiteDatabase db;

	public DataController(Context context)
	{
		this.context=context;
		dbHelper=new DataBaseHelper(context);
	}

	public DataController open()
	{
		db=dbHelper.getWritableDatabase();
		return this;
	}

	public void close()
	{
		dbHelper.close();
	}

	public long insert(ContentValues values) {
		return db.insertOrThrow(TABLE_NAME, null, values);
	}

	public Cursor retrieve()
	{
		return db.query(TABLE_NAME, new String[]{MESSAGE}, null, null, null, null, null);
	}

	private static class DataBaseHelper extends SQLiteOpenHelper
	{

		public DataBaseHelper(Context context)
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			try
			{
				db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
						_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
						NAME + " CHAR, " +
						Description + " CHAR, " +
						Price + " CHAR, " +
						Review + " CHAR);");
			}
			catch(SQLiteException e)
			{
				e.printStackTrace();
			}
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
			onCreate(db);
		}
	}

}