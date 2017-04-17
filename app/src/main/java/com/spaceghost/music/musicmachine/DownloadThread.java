package com.spaceghost.music.musicmachine;

import android.util.Log;

/**
 * Created by spaceghost on 4/16/17.
 */

public class DownloadThread extends Thread {


  private static final String TAG = DownloadThread.class.getSimpleName();
  private DownloadHandler mHandler;

  @Override
  public void run() {
    for (String song : Playlist.songs) {
      downloadSong(song);
    }
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
    Log.d(TAG, "downloadSong" + songName);
  }
}
