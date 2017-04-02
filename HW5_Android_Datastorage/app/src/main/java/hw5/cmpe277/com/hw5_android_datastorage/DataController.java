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

	public String search (String keyword) {
		//Select * FROM MyTable WHERE Mycolumn Like '%cat%'
		String myColumn = NAME;// + " " + Description + " " + Price + " " + Review;
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM ").append(TABLE_NAME).append(" WHERE ").append(myColumn).append(" Like ").append("'%").append(keyword).append("%'");
		Cursor c = db.rawQuery(sb.toString(), null);
		String str = "Not Found!";
		if (c.getCount() > 0) {
			str="Total "+c.getCount()+" results\n";
			str+="-----\n";

			c.moveToFirst();    // 移到第 1 筆資料
			do{        // 逐筆讀出資料
				str+="Item ID:"+c.getString(0)+"\n";
				str+="Item Name:"+c.getString(1)+"\n";
				str+="Item Description:"+c.getString(2)+"\n";
				str+="Item Price:"+c.getString(3)+"\n";
				str+="Item Review:"+c.getString(4)+"\n";
				str+="-----\n";
			} while(c.moveToNext());    // 有一下筆就繼續迴圈
		}
		return str;
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