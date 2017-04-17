package com.spaceghost.music.musicmachine;

import android.os.Looper;
import android.util.Log;

/**
 * Created by spaceghost on 4/16/17.
 */

public class DownloadThread extends Thread {


  private static final String TAG = DownloadThread.class.getSimpleName();
  public DownloadHandler mHandler;

  @Override
  public void run() {
    Looper.prepare();
    mHandler = new DownloadHandler();
    Looper.loop();
  }


}
