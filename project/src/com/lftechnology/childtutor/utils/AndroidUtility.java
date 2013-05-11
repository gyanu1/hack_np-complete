/**
 * 
 */
package com.lftechnology.childtutor.utils;

import java.io.IOException;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;

/**
 * @author navaraj
 * 
 */
public class AndroidUtility {
    public static void play(Context context, int id) {
        MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(context, id);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
    }
    
    public static void playKaKhaGa(Context context, String file) {
    	try {    		
    		MediaPlayer mMediaPlayer = new MediaPlayer();
    	    AssetFileDescriptor afd = context.getAssets().openFd(file);
    	    mMediaPlayer.setDataSource(
    	            afd.getFileDescriptor(),
    	            afd.getStartOffset(),
    	            afd.getLength()
    	        );
    	    afd.close();
    	    mMediaPlayer.prepare();
    	    mMediaPlayer.start();
    	} catch (IllegalArgumentException e) {
    	    e.printStackTrace();
    	} catch (IllegalStateException e) {
    	    e.printStackTrace();
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
