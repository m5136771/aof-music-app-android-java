package com.xilo.snlaof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    PDFView pdfview;

    private Button mFirstButton;
    private Button mSecondButton;
    private Button mThirdButton;
    private Button mFourthButton;
    private Button mFifthButton;
    private Button mSixthButton;
    private Button mSeventhButton;
    private Button mEighthButton;
    private Button mNinthButton;
    private Button mTenthButton;
    private Button mEleventhButton;
    private Button mTwelfthButton;
    private Button mThirteenthButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstButton = (Button)findViewById(R.id.main_button_1);
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start FirstArticleActivity
                Intent intent = new Intent(MainActivity.this, FirstArticleActivity.class);
                startActivity(intent);
            }
        });

        mSecondButton = (Button)findViewById(R.id.main_button_2);
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondArticleActivity.class);
                startActivity(intent);
            }
        });

        mThirdButton = (Button)findViewById(R.id.main_button_3);
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdArticleActivity.class);
                startActivity(intent);
            }
        });

        mFourthButton = (Button)findViewById(R.id.main_button_4);
        mFourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthArticleActivity.class);
                startActivity(intent);
            }
        });

        mFifthButton = (Button)findViewById(R.id.main_button_5);
        mFifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FifthArticleActivity.class);
                startActivity(intent);
            }
        });

        mSixthButton = (Button)findViewById(R.id.main_button_6);
        mSixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SixthArticleActivity.class);
                startActivity(intent);
            }
        });

        mSeventhButton = (Button)findViewById(R.id.main_button_7);
        mSeventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeventhArticleActivity.class);
                startActivity(intent);
            }
        });

        mEighthButton = (Button)findViewById(R.id.main_button_8);
        mEighthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EighthArticleActivity.class);
                startActivity(intent);
            }
        });

        mNinthButton = (Button)findViewById(R.id.main_button_9);
        mNinthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NinthArticleActivity.class);
                startActivity(intent);
            }
        });

        mTenthButton = (Button)findViewById(R.id.main_button_10);
        mTenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TenthArticleActivity.class);
                startActivity(intent);
            }
        });

        mEleventhButton = (Button)findViewById(R.id.main_button_11);
        mEleventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start FirstArticleActivity
                Intent intent = new Intent(MainActivity.this, EleventhArticleActivity.class);
                startActivity(intent);
            }
        });

        mTwelfthButton = (Button)findViewById(R.id.main_button_12);
        mTwelfthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwelfthArticleActivity.class);
                startActivity(intent);
            }
        });

        mThirteenthButton = (Button)findViewById(R.id.main_button_13);
        mThirteenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirteenthArticleActivity.class);
                startActivity(intent);
            }
        });
    }
}
