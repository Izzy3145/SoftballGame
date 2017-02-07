package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore;
    int awayScore;
    int strikes;
    int catches;
    int stumps;
    int totalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * increases home team score by either 4, 2 or 1
     */

    public void addFourForHome(View v) {
        homeScore = homeScore + 4;
        displayForHomeTeam(homeScore);
    }

    public void addTwoForHome(View v) {
        homeScore = homeScore + 2;
        displayForHomeTeam(homeScore);
    }

    public void addOneForHome(View v) {
        homeScore = homeScore + 1;
        displayForHomeTeam(homeScore);
    }

    /**
     * Displays the given score for Home team.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases home team score by either 4, 2 or 1
     */

    public void addFourForAway(View v) {
        awayScore = awayScore + 4;
        displayForAwayTeam(awayScore);
    }

    public void addTwoForAway(View v) {
        awayScore = awayScore + 2;
        displayForAwayTeam(awayScore);
    }

    public void addOneForAway(View v) {
        awayScore = awayScore + 1;
        displayForAwayTeam(awayScore);
    }

    /**
     * Displays the given score for Home team.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneStrike(View v) {
        strikes = strikes + 1;
        displayStrikes(strikes);
        totalOut = totalOut + 1;
        displayTotalOut(totalOut);
    }

    public void displayStrikes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_strikes);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds one catch and updates the display
     */
    public void addOneCatch(View v) {
        catches = catches + 1;
        displayCatches(catches);
        totalOut = totalOut + 1;
        displayTotalOut(totalOut);
    }

    public void displayCatches(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_catches);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds one stump and updates the display
     */
    public void addOneStump(View v) {
        stumps = stumps + 1;
        displayStumps(stumps);
        totalOut = totalOut + 1;
        displayTotalOut(totalOut);
    }

    public void displayStumps(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_stumps);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_out);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * this resets the Batting Team figures to zero, ready for a new innings
     */
    public void newInnings(View v) {
        strikes = 0;
        displayStrikes(strikes);
        stumps = 0;
        displayStumps(stumps);
        catches = 0;
        displayCatches(catches);
        totalOut = 0;
        displayTotalOut(totalOut);
    }

    /**
     * this resets all figures to zero, ready for a new game
     */
    public void newGame(View v) {
        homeScore = 0;
        displayForHomeTeam(homeScore);
        awayScore = 0;
        displayForAwayTeam(awayScore);
        strikes = 0;
        displayStrikes(strikes);
        stumps = 0;
        displayStumps(stumps);
        catches = 0;
        displayCatches(catches);
        totalOut = 0;
        displayTotalOut(totalOut);
    }
}
