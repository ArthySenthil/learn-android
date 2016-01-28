package com.example.android.learnandroid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer =MediaPlayer.create(this,R.raw.sleep);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void playMusic(View view){
        mMediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMediaPlayer.release();
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView menu_item_1_tv=(TextView )findViewById(R.id.menu_item_1);
        String text1=menu_item_1_tv.getText().toString();;

        Log.i("LearnAndroid.java",text1);

        // Find second menu item TextView and print the text to the logs
        TextView menu_item_2_tv=(TextView )findViewById(R.id.menu_item_2);
        String text2=menu_item_2_tv.getText().toString();

        Log.i("LearnAndroid.java",text2);

        // Find third menu item TextView and print the text to the logs
        TextView menu_item_3_tv=(TextView )findViewById(R.id.menu_item_3);
        String text3=(String)menu_item_3_tv.getText();

        Log.i("LearnAndroid.java",text3);

    }


}
