package com.example.android.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalClicks = 1;
    int upgrade = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScore(1);
    }

    public void addClick(View v) {
        totalClicks++;
        displayScore(totalClicks * upgrade);
    }

    public void moreClicks(View v) {
        upgrade++;
    }

    public void resetClicks(View v) {
        upgrade = 1;
        totalClicks = 1;
        displayScore(1);
    }

    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.clicks);
        scoreView.setText(String.valueOf(score));
    }
}
