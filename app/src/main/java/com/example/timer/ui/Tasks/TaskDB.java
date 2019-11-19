package com.example.timer.ui.Tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TaskDB
{
    private ArrayList<Task> tasks;

    /*create a new Task database*/
    public TaskDB()
    {
        this.tasks = new ArrayList<Task>();
    }


    /*Add a value entry to the back of the database
     *
     * param: value: the value to add
     *
     * ireturn: true if te task was added, false otherwise*/
    public Boolean addValue(Object value)
    {
        if (value instanceof Task)// check that value is a course
        {
            Task newTask = (Task) value;
            return (this.tasks.add( newTask));
        }

        return false;
    }

    /*Get all the values in the database in linear time.
     *
     * ireturn: all the values*/
    public ArrayList getAllValues()
    {
        return(tasks);
    }

    /* Get the first value for an associated task name
     *
     * param: taskName: the name of the task
     *
     * ireturn: the value that is associated with the task name, or null if not present
     */
    public Task getValue(String taskName)
    {
        Iterator it = tasks.iterator();
        while(it.hasNext()) {

            Task temp = ((Task)it.next());
            if (temp.getTaskName().equals(taskName)){
                return(temp);
            }
        }
        return null;
    }

    /*Indicates whether a Task with the task name is in the database or not
     *
     * param: taskName: the name to search for
     *
     * ireturn: whether the Task is present or not
     */
    public boolean hasTask(String taskName)
    {
        Iterator it = tasks.iterator();
        while(it.hasNext()) {

            if (((Task)it.next()).getTaskName().equals(taskName)){
                return(true);
            }
        }
        return false;
    }

    /*Indicates whether a Task is in the database or not
     *
     * param: Task: the task to search for
     *
     * ireturn: whether the Task is present or not
     */
    public boolean hasTask(Task task)
    {
        return tasks.contains(task);
    }
}
