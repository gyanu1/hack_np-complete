package com.lftechnology.childtutor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class LessonPlay extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lesson_play);

		// Create and set adapter
		LessonPlayAdapter adapter = new LessonPlayAdapter(this);
		ViewPager myPager = (ViewPager) findViewById(R.id.customviewpager);
		myPager.setAdapter(adapter);
		myPager.setCurrentItem(0);
		
		
	}

}
