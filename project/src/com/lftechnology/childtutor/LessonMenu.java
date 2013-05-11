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

import com.lftechnology.childtutor.utils.AndroidUtility;

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
        View lesson1Button = findViewById(R.id.lesson1);
        lesson1Button.setOnClickListener(LessonMenu.this);
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
        AndroidUtility.play(this, R.raw.beep9); // To generate sound
                                                            // while clicking
                                                            // button

        switch (v.getId()) {

        case R.id.lesson1:
            // call lessen1
            break;
        case R.id.lesson2:
            // call lessen1
            break;

        }
    }
}
