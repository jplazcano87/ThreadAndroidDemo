package com.spaceghost.music.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by spaceghost on 4/16/17.
 */

public class DownloadHandler extends Handler {

  private static final String TAG = DownloadHandler.class.getSimpleName();

  @Override
  public void handleMessage(Message msg) {
    downloadSong(msg.obj.toString());
  }

  private void downloadSong(String songName) {
    long endTime = System.currentTimeMillis() + 10 * 1000; // add 10 seconds to the current
    // system time
    while (System.currentTimeMillis() < endTime) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    Log.d(TAG, "downloadSong: " + songName);
  }
}
