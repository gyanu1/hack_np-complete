package com.lftechnology.childtutor;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.lftechnology.childtutor.model.Lesson;
import com.lftechnology.childtutor.model.LessonParser;

public class LessonPlay extends Activity {

	private Lesson lesson;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lesson_play);

		// Create and set adapter
		LessonPlayAdapter adapter = new LessonPlayAdapter(this);
		ViewPager myPager = (ViewPager) findViewById(R.id.customviewpager);
		myPager.setAdapter(adapter);
		myPager.setCurrentItem(0);

		loadLesson();

	}

	private void loadLesson() {
		try {
			Bundle bundle = getIntent().getExtras();
			String lessonName = bundle.getString("lesson");

			InputStream is = this.getAssets().open(lessonName + "/lesson.xml");
			lesson = LessonParser.parse(is);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
