/**
 * 
 */
package com.lftechnology.childtutor;


import com.lftechnology.childtutor.utils.AndroidUtility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author navaraj
 * 
 */
public class LessonMenu extends Activity implements OnClickListener {

	private static final String TAG = "LessonMenu";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		Log.d(TAG, "Creating lesson");

		super.onCreate(savedInstanceState);
		setContentView(R.layout.lesson_activity);
		
		View lesson2Button = findViewById(R.id.lesson2);
		lesson2Button.setOnClickListener(LessonMenu.this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent j = new Intent(getApplicationContext(), Next1.class);
		startActivity(j);
	}
}
