package com.lftechnology.childtutor;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.lftechnology.childtutor.model.Lesson;
import com.lftechnology.childtutor.model.LessonParser;

public class LessonPlay extends Activity {

    private Lesson lesson;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_play);
        loadLesson();
        Lesson.Page currentPage=lesson.getNextPage();        
        Log.i(Home.TAG, "image :"+currentPage.image +"sound :"+currentPage.sound);

        // Create and set adapter
        LessonPlayAdapter adapter = new LessonPlayAdapter(this,lesson);
        ViewPager myPager = (ViewPager) findViewById(R.id.customviewpager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
      

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
