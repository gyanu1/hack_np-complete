/**
 * 
 */
package com.lftechnology.childtutor.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

/**
 * @author navaraj
 * 
 */
public class AndroidUtility {
    public static void buttonClickSound(Context context, int id) {
        MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(context, id);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();

    }

}
