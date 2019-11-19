package com.example.timer;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean running;
    private long pause;

    /**
     * auto-generated method that creates what the user sees/creates the application
     * @param savedInstanceState
     * @author (edited by) Miguel Rosario, Su Thit Thazin, Joseph Saltalamacchia
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());

        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                // Creates a special Message when the timer hits 10 seconds (Subject to change)
                if((SystemClock.elapsedRealtime()-chronometer.getBase())>=150000){
                    Toast.makeText(MainActivity.this,
                            "SE > CS",
                            Toast.LENGTH_SHORT)
                            .show();

                }
            }
        });
    }

    /**
     * Starts the timer from 00 (or from the time when paused)
     * and counts until the user stops it.
     * @param v - The view
     * @author Miguel Rosario + Joseph Saltalamacchia
     */
    public void startChronometer(View v){
        //if not running
        if(!running){

            //Grab the SystemClock Timer and start at 0
            //But if the timer was started and then paused
            //Subtract the elapsed time between pause and start to
            //get the correct timing.
            chronometer.setBase(SystemClock.elapsedRealtime() - pause);
            chronometer.start();
            running = true;
        }
    }

    /**
     * Pauses the chronometer and keeps track of the elapsed system time
     * so it may subtract it once the timer is resumed.
     * @param v - The view
     * @author Su Thit Thazin + Miguel Rosario
     */
    public void pauseChronometer(View v){
        //if running
        if(running){

            //pause the counter
            chronometer.stop();
            pause = SystemClock.elapsedRealtime() - chronometer.getBase();

            //timer is no longer running
            running = false;
        }
    }

    /**
     * Resets the timer to 00:00
     * @param v - the view
     * @author Miguel Rosario
     */
    public void resetChronometer(View v){
        //Set the timer back to 00:00
        chronometer.setBase(SystemClock.elapsedRealtime());
        pause = 0;
    }

}