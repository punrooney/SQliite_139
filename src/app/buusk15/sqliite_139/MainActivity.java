package app.buusk15.sqliite_139;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
   SQLiteDatabase db;
   private Button btninsert;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   control139DB control139db = new control139DB(this);
      //  control139db.getWritableDatabase();
        btninsert = (Button) findViewById(R.id.btn_insert);
        btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplication(),AddActivity.class);
				startActivity(intent);
			}
		});
        
        
    }


  
}
