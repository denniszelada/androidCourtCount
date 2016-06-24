package com.meimportatunegocio.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOnePointTeamA(View v) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }


    public void addTwoPointsTeamA(View v) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }


    public void addThreePointsTeamA(View v) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void addOnePointTeamB(View v) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }


    public void addTwoPointsTeamB(View v) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }


    public void addThreePointsTeamB(View v) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
