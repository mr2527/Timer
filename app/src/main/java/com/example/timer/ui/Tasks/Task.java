package com.example.timer.ui.Tasks;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.StreamSupport;

/**
 *
 */
public class Task {

    private String taskName;
    private String taskDescription;
    private String dueDate;
    private Stats Statistics;
    private Task masterTask;
    private float totalTime;
    private int totalDays;
    private ArrayList<Task> subTasks;

    /**
     *
     * @param taskName name of the task
     * @param taskDescription description of the task
     * @param dueDate due date of the task
     */
    public Task(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.totalDays = 0;
        this.totalTime = 0;
        Statistics = new Stats();
    }



    /**
     * adds a subtask to the back of the list of subTasks
     *
     * @param newTask the task to be added
     *
     * @return whether or not the task was added to the list
     *
     * @author Joseph Saltalamacchia*/
    public boolean addSubTask(Task newTask)
    {
        return(subTasks.add((new subTask(this,newTask))));
    }

    /**
     * removes a subtask from the of the list of subTasks
     *
     * @param task subtask being removed
     *
     * @return whether or not the task was removed from the list
     *
     * @author Joseph Saltalamacchia*/
    public boolean removeSubTask(subTask task)
    {
        return(subTasks.remove(task));
    }

    /**
     * checks to see if a particular subtask is in the list
     *
     * @param task the task to be checked
     *
     * @return whether or not the task is in the list
     *
     * @author Joseph Saltalamacchia*/
    public boolean containsSubTask(subTask task)
    {
        return(subTasks.contains(task));
    }

    /**
     * prints all of the subtasks in a task
     *
     * @author Joseph Saltalamacchia*/
    public void allSubTasks() {
        System.out.println(subTasks);
    }

    /**
     * returns the number of days until the task is due
     * Prerequ The string must be in MM/DD/YYYY format
     * @param today's date in "MM/DD/YYYY" form
     * @return the number of days until the due date
     *  Author: Joseph Saltalamacchia
     */
    public int daysUntilDue(String today)
    {
        String[] partsDue = dueDate.split("/");
        String[] partsToday = today.split("/");

        return(Integer.parseInt(partsDue[1]) - Integer.parseInt(partsToday[1]));

    }

    /**
     * check if the project was finished in time
     *
     * return: if the project was finished it time of not
     *         note: if the project is not finished, return false
     *         * Author: Joseph Saltalamacchia - Edited by Miguel Rosario
     */
    public boolean finishedInTime()
    {
        //test if the task is finished
        //test if the due date year is less than the finished year
        //test if the due month is less than the finished month
        if (Statistics.isActive() || parseYear(this.dueDate) <
                parseYear(Statistics.getDateCompleted())) {
            return false;
        } else if (parseMonth(this.dueDate) <
                parseMonth(Statistics.getDateCompleted())) {
            return false;
        }
        //test if the due day is less than the finished day
        else
            return parseDay(this.dueDate) >= parseDay(Statistics.getDateCompleted());

    }

    /**
    * accepts a string in MM/DD/YYYY and returns the year as an integer
    *
    * prerequ: the string must be in MM/DD/YYYY format
    *
    * @param date the date in MM/DD/YYYY format
    *
    * @return the year as an integer
    *
    * @author Joseph Saltalamacchia*/
    private int parseYear(String date)
    {
        return(Integer.parseInt(date.substring(7,11)));
    }
    /**
     * accepts a string in MM/DD/YYYY and returns the Month as an integer
     *
     * prerequ: the string must be in MM/DD/YYYY format
     *
     * @param date the date in MM/DD/YYYY format
     *
     * @return the Month as an integer
     *
     * @author Joseph Saltalamacchia*/
    private int parseMonth(String date)
    {
        return(Integer.parseInt(date.substring(0,2)));
    }
    /**
     * accepts a string in MM/DD/YYYY and returns the Day as an integer
     *
     * prerequ: the string must be in MM/DD/YYYY format
     *
     * @param date the date in MM/DD/YYYY format
     *
     * @return the Day as an integer
     *
     * @author Joseph Saltalamacchia*/
    private int parseDay(String date)
    {
        return(Integer.parseInt(date.substring(3,5)));
    }



    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public void AddDays(int days)
    {
        this.totalDays += days;
    }

    public void addTime(float time)
    {
        this.totalTime += time;
    }






    /**
     * Get the name of the task
     * @return the task name
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Set the name of the task
     * @param taskName the task name
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Get the description of the task
     * @return the description of the task.
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Setter for the tasks description
     * @param taskDescription The description of the current task.
     * @author Miguel Rosario
     */

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     *
     * @return
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     *
     * @param dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *
     * @return
     */
    public Stats getStatistics() {
        return Statistics;
    }

    /**
     *
     * @param statistics
     */
    public void setStatistics(Stats statistics) {
        Statistics = statistics;
    }

    /**
     *
     * @return
     */
    public Task getMasterTask() {
        return masterTask;
    }

    /**
     *
     * @param masterTask
     */
    public void setMasterTask(Task masterTask) {
        this.masterTask = masterTask;
    }


    /**
     * Get a sub task.
     * @param name the name of the task
     * @return the sub task that we are looking for
     * @author Su Thit Thazin
     */
    public Task getSubTask (String name) {
        for (Object t : this.subTasks) {
            Task task = (Task) t;
            if (task.taskName.equals(name)) {
                return task;
            }
        }
        return null;
    }

    /**
     * compares Tasks based on the task name, the description of that task, and it's due date
     *
     * @param o the object being compared
     */ @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return taskName.equals(task.taskName) &&
                taskDescription.equals(task.taskDescription) &&
                dueDate.equals(task.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskDescription, dueDate);
    }


    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", Statistics=" + Statistics +
                ", masterTask=" + masterTask +
                ", totalTime=" + totalTime +
                ", totalDays=" + totalDays +
                ", subTasks=" + subTasks +
                '}';
    }
}