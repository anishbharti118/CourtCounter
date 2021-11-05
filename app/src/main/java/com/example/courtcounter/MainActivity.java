package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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

    public void add3_a(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void add2_a(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void add1_a(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void add3_b(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void add2_b(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void add1_b(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view){
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}