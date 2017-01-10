package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3points(View view){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void add2points(View view){
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void add1points(View view){
        teamAScore++;
        displayForTeamA(teamAScore);
    }
}
