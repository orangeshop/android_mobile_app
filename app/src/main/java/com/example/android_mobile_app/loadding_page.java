package com.example.android_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class loadding_page extends AppCompatActivity {

    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadding_page);
        ImageView gomduri = (ImageView)findViewById(R.id.iv1);
        Glide.with(this).load(R.raw.asd).into(gomduri);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3300);

        prog();
    }

    public void prog()
    {
        ProgressBar progress = (ProgressBar) findViewById(R.id.progress);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter += 3;
                progress.setProgress(counter);

                if(counter== 100){
                    t.cancel();
                }
            }
        };

        t.schedule(tt,0,100);
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}