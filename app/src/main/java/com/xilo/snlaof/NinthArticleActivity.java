package com.xilo.snlaof;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class NinthArticleActivity extends AppCompatActivity implements Runnable {
    PDFView pdfView;

    //Define Variables
    private Handler handler;
    private MediaPlayer mp;
    private Runnable runnable;
    private SeekBar seekBar;
    private ImageButton play;
    private Switch toggleSwitch;
    private TextView currentTime;
    private TextView totalTime;
    private Utilities utils;

    //Define Layouts
    private ConstraintLayout constraintLayout;
    private ConstraintSet constraintSet1 = new ConstraintSet();
    private ConstraintSet constraintSet2 = new ConstraintSet();

    //Start Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_article);

        //??
        handler = new Handler();

        //Display PDF
        pdfView = findViewById(R.id.article_9_display);
        pdfView.fromAsset("Article_9.pdf").load();

        //Constraint Sets
        constraintLayout = findViewById(R.id.cl9);
        constraintSet1.clone(constraintLayout);
        constraintSet2.clone(this, R.layout.activity_ninth_article_wp);

        //Floating Action Button
        FloatingActionButton fab9 = findViewById(R.id.fab9);
        fab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                constraintSet2.applyTo(constraintLayout);

                //Create Media Player
                mp = new MediaPlayer().create(NinthArticleActivity.this, R.raw.article9);

                utils = new Utilities();

                seekBar.setMax(mp.getDuration());
                seekBar.setProgress(0);
                seekBar.setVisibility(ProgressBar.VISIBLE);

                mp.start();

                updateSeekBar();
                changeSeekbar();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 2000);
            }
        });

        play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play.setImageResource(R.drawable.baseline_play_arrow_black_18dp);
                    changeSeekbar();
                } else {
                    mp.start();
                    play.setImageResource(R.drawable.baseline_pause_black_18dp);
                    changeSeekbar();
                }
            }
        });

        ImageButton rewind = findViewById(R.id.rewind);
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cu = mp.getCurrentPosition();
                mp.seekTo(cu - 5000);
                changeSeekbar();
            }
        });

        ImageButton forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cu = mp.getCurrentPosition();
                mp.seekTo(cu + 5000);
                changeSeekbar();
            }
        });

        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(0);
                changeSeekbar();
            }
        });

        toggleSwitch = findViewById(R.id.toggleSwitch);
        toggleSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                mp.release();
                play.setImageResource(R.drawable.baseline_play_arrow_black_18dp);
                if (toggleSwitch.isChecked()) {
                    mp = MediaPlayer.create(NinthArticleActivity.this, R.raw.article9);
                    seekBar.setMax(mp.getDuration());
                    seekBar.setVisibility(ProgressBar.VISIBLE);
                    seekBar.setProgress(0);
                }else {
                    mp = MediaPlayer.create(NinthArticleActivity.this, R.raw.article9_inst);
                    seekBar.setMax(mp.getDuration());
                    seekBar.setVisibility(ProgressBar.VISIBLE);
                    seekBar.setProgress(0);
                }
            }
        });

        currentTime = findViewById(R.id.start_time);
        totalTime = findViewById(R.id.end_time);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    mp.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void run() {
        int currentPosition= 0;
        int total = mp.getDuration();
        while (mp!=null && currentPosition<total) {
            try {
                Thread.sleep(1000);
                currentPosition= mp.getCurrentPosition();
            } catch (InterruptedException e) {
                return;
            } catch (Exception e) {
                return;
            }

            seekBar.setProgress(currentPosition);
        }

    }

    //Update Seek Bar Function
    public void updateSeekBar() {
        handler.postDelayed(mUpdateTimeTask, 100);
    }
    private Runnable mUpdateTimeTask = new Runnable() {
        @Override
        public void run() {
            long totalDuration = mp.getDuration();
            long currentDuration = mp.getCurrentPosition();

            //Displaying Total Duration Time
            totalTime.setText(""+utils.milliSecondsToTimer(totalDuration));
            // Displaying time completed playing
            currentTime.setText(""+utils.milliSecondsToTimer(currentDuration));

            // Running this thread after 100 milliseconds
            handler.postDelayed(this, 100);
        }
    };

    private void changeSeekbar() {
        seekBar.setProgress(mp.getCurrentPosition());

        if(mp.isPlaying()){
            runnable = new Runnable() {
                @Override
                public void run() {
                    changeSeekbar();
                }
            };

            handler.postDelayed(runnable, 100);
        }

    }

    @Override
    public void onStop() {
        super.onStop();

        if (mp != null) {
            mp.stop();
        }
    }

}
