package com.example.android.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    public void displayForTeamA(int start) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void scoreThree(View view){
        score=score+3;
        display(score);
    }
    public void scoreTwo(View view){
        score=score+2;
        display(score);
    }
    public void scoreFreeThrow(View view){
        score=score+1;
        display(score);
    }
    public void resetMatch(View view){
        score=0;
        display(score);
    }
    public void display (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }
}
