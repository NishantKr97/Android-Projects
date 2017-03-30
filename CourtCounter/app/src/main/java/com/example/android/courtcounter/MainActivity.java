package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void display1(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void display2(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void display3(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void display4(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void display5(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void display6(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void display7(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
