package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Date;
import java.io.File;

/**
 * Window for adding a task, prompts the user to enter the name, the due date, and the
 * description of the task
 */
public class add_task extends AppCompatActivity {

    String taskName, taskDescription, taskDueDate;

    EditText taskNameInput;
    EditText taskDescriptionInput;
    EditText taskDueDateInput;

    private Button createTask;

    private Button cancel;

    private BufferedWriter out;

    private BufferedReader in;

    /**
     * auto-generated method that creates what the user sees/creates the application
     * @param savedInstanceState
     * @author Su Thit Thazin $ Joseph Saltalamacchia
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        //create the readers and writers

        try {
            out = new BufferedWriter(new FileWriter(new File(getApplicationContext().getFilesDir() + "Tasks.txt")));
            in = new BufferedReader(new FileReader(new File(getApplicationContext().getFilesDir() + "Tasks.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        taskNameInput = findViewById(R.id.taskName);
        taskDescriptionInput = findViewById(R.id.taskDescription);
        taskDueDateInput = findViewById(R.id.taskDueDate);
        createTask = findViewById(R.id.createTask);
        createTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taskName = taskNameInput.getText().toString();
                taskDescription = taskDescriptionInput.getText().toString();
                taskDueDate = taskDueDateInput.getText().toString();
                createTask(taskName, taskDescription, taskDueDate);
                try {
                    out.write(taskName + ", "  + taskDescription + ", " + taskDueDate);
                    out.flush();
                    String words = in.readLine();
                    System.out.println(words);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        System.out.println("Anything at all");
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
    public void createTask(String name, String description, String date)
    {
        com.example.timer.ui.Tasks.Task newTask = new com.example.timer.ui.Tasks.Task(name, description, date);
        startActivity(new Intent(this, Task.class));
    }

    public void goHome()
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
