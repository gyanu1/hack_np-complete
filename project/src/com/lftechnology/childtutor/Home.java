package com.lftechnology.childtutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.lftechnology.childtutor.utils.AndroidUtility;

public class Home extends Activity implements OnClickListener {
	private static final String TAG = "Home";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Loading Child Tutor..");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		TextView myText = (TextView) findViewById(R.id.checkedTextView1);
		Animation anim = new AlphaAnimation(0.0f, 1.0f);
		anim.setDuration(100); //You can manage the time of the blink with this parameter
		anim.setStartOffset(20);
		anim.setRepeatMode(Animation.REVERSE);
		anim.setRepeatCount(Animation.INFINITE);
		myText.startAnimation(anim);
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
		AndroidUtility.play(this, R.raw.buttonclick);// To generate sound
												// while clicking
												// button

		Intent j = new Intent(getApplicationContext(), LessonMenu.class);
		startActivity(j);

	}
}
