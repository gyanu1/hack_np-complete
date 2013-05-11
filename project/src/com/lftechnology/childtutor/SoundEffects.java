/**
 * 
 */
package com.lftechnology.childtutor;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

/**
 * @author navaraj
 *
 */
public class SoundEffects {
	public static void buttonClickSound(Context context)
	{
		MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(context, R.raw.beep9);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
		
	}

}
