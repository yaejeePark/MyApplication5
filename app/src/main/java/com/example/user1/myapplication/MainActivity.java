package com.example.user1.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    LinearLayout layout1;
    private MediaPlayer mediaPlayer;
    private int playbackPosition = 0;
    int id_audio1;
    int id_audio2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.audio2);
        layout1 = (LinearLayout) findViewById(R.id.audio3);


    }

    public void onclick1(View v){
        String tag1 = (String) v.getTag();
        id_audio1 = getResources().getIdentifier(tag1, "raw", getPackageName()); //receive audio id
        play(id_audio1);
    }
    public void play(int m){
        try{
            MediaPlayer mp= MediaPlayer.create(this,m);//여기 this를 getApplicationContext()로 바꿔 보시게~
            mp.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
