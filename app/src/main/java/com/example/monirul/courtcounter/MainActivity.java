package com.example.monirul.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamName;
    TextView scoreView;

    Button highestButton;
    Button secondHighestButton;
    Button lowestButton;
    Button resetButton;

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreView = findViewById(R.id.score);
        teamName = findViewById(R.id.team_name);
        highestButton = findViewById(R.id.highest_point);
        secondHighestButton = findViewById(R.id.second_highest_point);
        lowestButton = findViewById(R.id.lowest_point);
        resetButton = findViewById(R.id.reset_button);
    }

    public void displayForTeamA(int score){

        scoreView.setText(""+ score);

    }

    public void highestPoint(View view){

        points = points + 3;
        displayForTeamA(points);

    }
    public void secondHighestPoint(View view){

        points = points + 2;
        displayForTeamA(points);

    }
    public void lowestPoint(View view){

        points = points + 1;
        displayForTeamA(points);
    }
    public void resetPoint(View view){

        points = 0;
        displayForTeamA(points);
    }
}
