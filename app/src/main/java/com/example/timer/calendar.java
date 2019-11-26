package com.example.timer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// kjd fgbjc v
import androidx.appcompat.app.AppCompatActivity;


public class calendar extends AppCompatActivity {

    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        homeButton = findViewById(R.id.Home);

        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goHome();
            }
        });
    }

    public void goHome()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
