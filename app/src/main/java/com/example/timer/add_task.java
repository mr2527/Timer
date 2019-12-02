package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Window for adding a task, prompts the user to enter the name, the due date, and the
 * description of the task
 */
public class add_task extends AppCompatActivity {

    private Button createTask;

    private Button cancel;

    /**
     * auto-generated method that creates what the user sees/creates the application
     * @param savedInstanceState
     * @author Su Thit Thazin
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        createTask = findViewById(R.id.createTask);
        createTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createTask();
            }
        });

        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
    }

    /**
     * Creates the task that the user has entered.
     * @author Joseph Saltalamacchia
     */
    public void createTask()
    {
        startActivity(new Intent(this, Task.class));
    }

    public void goHome()
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
