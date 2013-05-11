/**
 * 
 */
package com.lftechnology.childtutor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author navaraj
 *
 */
public class LessonMenu extends Activity implements OnClickListener{
	
	private static final String TAG = "LessonMenu";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		Log.d(TAG, "Creating lesson");
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lesson_activity);
		View lesson1Button = findViewById(R.id.lesson1);
		lesson1Button.setOnClickListener((OnClickListener) LessonMenu.this);
		View lesson2Button = findViewById(R.id.lesson2);
		lesson2Button.setOnClickListener((OnClickListener) LessonMenu.this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.childTutorLogo:
			//call lessen1
			break;


		}
	}
}
