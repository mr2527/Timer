package com.example.timer.ui.Tasks;

public class subTask extends Task{

    /** the master task that this sub task belongs to */
    public Task masterTask;

    /**
     * @param taskName        name of the task
     * @param taskDescription description of the task
     * @param dueDate         due date of the task
     */
    public subTask(String taskName, String taskDescription, String dueDate, Task masterTask) {
        super(taskName, taskDescription, dueDate);
        this.masterTask = masterTask;
    }

    /**
     * Creates a subtask object
     * @param masterTask original task
     * @param subTask lower class
     */
    subTask(Task masterTask, Task subTask) {
        super(subTask.getTaskName(), subTask.getTaskDescription(), subTask.getDueDate());
        this.masterTask = masterTask;
    }
}
