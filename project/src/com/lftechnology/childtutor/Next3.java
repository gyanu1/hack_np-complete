package com.lftechnology.childtutor;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Next3 extends Activity implements OnClickListener {
	private static final String TAG = "Home";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Loading Child Tutor..");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gha);
		  MediaPlayer mMediaPlayer = new MediaPlayer();
	        mMediaPlayer = MediaPlayer.create(this, R.raw.ga);
	        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
	        mMediaPlayer.setLooping(true);
	        mMediaPlayer.start();
		
		// Add event handlers for buttons
		View lesson1Button = findViewById(R.id.nextbutton3);
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
		Intent j = new Intent(getApplicationContext(), Home.class);
		startActivity(j);

	}
}
