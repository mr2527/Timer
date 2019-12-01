package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class Task extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        this.button1 = findViewById(R.id.taskButton1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart1);
                song.start();
            }

        });

        this.button2 = findViewById(R.id.taskButton2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart2);
                song.start();
            }

        });

        this.button3 = findViewById(R.id.taskButton3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart3);
                song.start();
            }

        });

        this.button4 = findViewById(R.id.taskButton4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart4);
                song.start();
            }

        });

        this.button5 = findViewById(R.id.taskButton5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart5);
                song.start();
            }

        });

        this.button6 = findViewById(R.id.taskButton6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart6);
                song.start();
            }

        });

        this.button7 = findViewById(R.id.taskButton7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart7);
                song.start();
            }

        });

        this.button8 = findViewById(R.id.taskButton8);

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart8);
                song.start();
            }

        });

        this.button9 = findViewById(R.id.taskButton9);

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart9);
                song.start();
            }

        });

        this.button10 = findViewById(R.id.taskButton10);

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart10);
                song.start();
            }

        });

        this.button11 = findViewById(R.id.taskButton11);

        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                song = MediaPlayer.create(com.example.timer.Task.this, R.raw.fart11);
                song.start();
            }

        });

    }
}
