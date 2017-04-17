package com.spaceghost.music.musicmachine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  private Button mDownloadButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mDownloadButton = (Button) findViewById(R.id.downloadButton);

    mDownloadButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Downloading", Toast.LENGTH_SHORT).show();
        DownloadThread downloadThread = new DownloadThread();
        downloadThread.setName("DownloadThread");
        downloadThread.start();
      }
    });
  }



}
