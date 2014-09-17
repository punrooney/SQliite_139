package app.buusk15.sqliite_139;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class control139DB extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "mydata139";
	private static final String TABLE_MEMBER = "members";
	private static final int DATABASE_VERSION = 1;

	public control139DB(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + TABLE_MEMBER
				+ "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " Age TEXT(100)," + " Height INTEGER(100),"
				+ " Weight TEXT(100)," + " Sex TEXT(100),"
				+ " Religion TEXT(100)," + " Talent TEXT(100),"
				+ " Address TEXT(100)," + " Smoke TEXT(100));");
		Log.d("CREATE TABLE", "Create Table Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTE " + TABLE_MEMBER);
		onCreate(db);
	}

	public long InsertData(String strAge, String strHei, String strWei,
			String strSex, String strRel, String strTal,
			String strAdd, String strSmo) {
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("Age", strAge);
			values.put("Height", strHei);
			values.put("Weight", strWei);
			values.put("Sex", strSex);
			values.put("Religion", strRel);
			values.put("Talent", strTal);
			values.put("Address", strAdd);
			values.put("Smoke", strSmo);
			long l = db.insert(TABLE_MEMBER, null, values);
			db.close();
			return l;
		} catch (Exception e) {
			return -1;
		}
	}
}