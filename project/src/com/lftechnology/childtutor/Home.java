package com.lftechnology.childtutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.lftechnology.childtutor.utils.AndroidUtility;

public class Home extends Activity implements OnClickListener {
	private static final String TAG = "Home";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Loading Child Tutor..");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// Add event handlers for buttons
		View lesson1Button = findViewById(R.id.home);
		lesson1Button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		AndroidUtility.play(this, R.raw.beep9);// To generate sound
												// while clicking
												// button

		Intent j = new Intent(getApplicationContext(), LessonMenu.class);
		startActivity(j);

	}
}
