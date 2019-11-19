package com.example.timer.ui.Tasks;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
*/
public class Stats {

    private String dateAssigned;
    private String dateCompleted;
    private double estimateTime;
    private double actualTime;
    private boolean isActive;

    /**
     * a Stats object that has 5 variables instantiated.
     * @param dateAssigned The date assigned.
     * @param dateCompleted The date the task is completed.
     * @param estimateTime The estimated time the task will take.
     * @param actualTime The actual time the task took.
     * @param isActive If the current task is active or not.
     * @author Miguel Rosario
     */
    public Stats(String dateAssigned, String dateCompleted, double estimateTime, double actualTime, boolean isActive) {
        this.dateAssigned = dateAssigned;
        this.dateCompleted = dateCompleted;
        this.estimateTime = estimateTime;
        this.actualTime = actualTime;
        this.isActive = isActive;
    }
    public Stats()
    {
        this.dateAssigned = null;
        this.dateCompleted = null;
        this.estimateTime = 0.0;
        this.actualTime = 0.0;
        this.isActive = true;
    }


    /**
     * Getter for the assigned date.
     * @return the date assigned.
     * @author Miguel Rosario - Generated
     */
    public String getDateAssigned() {
        return dateAssigned;
    }

    /**
     * Setter for the assigned date.
     * @param dateAssigned set the assigned date.
     * @author Miguel Rosario - Generated
     */
    public void setDateAssigned(String dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    /**
     * Getter for the date the task is completed.
     * @return the completion date
     * @author Miguel Rosario - Generated
     */
    String getDateCompleted() {
        return dateCompleted;
    }

    /**
     * setter for the date of completion.
     * @param dateCompleted The date the task is completed.
     * @author Miguel Rosario - Generated
     */
    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    /**
     * Getter for the estimated time.
     * @return estimated time.
     * @author Miguel Rosario - Generated
     */
    public double getEstimateTime() {
        return estimateTime;
    }

    /**
     * Setter for the estimated time.
     * @param estimateTime the estimated time it takes to finish a task.
     * @author Miguel Rosario - Generated
     */
    public void setEstimateTime(double estimateTime) {
        this.estimateTime = estimateTime;
    }

    /**
     * Getter for the actual time it takes to complete.
     * @return The actual time it took to complete a task.
     * @author Miguel Rosario - Generated
     */
    public double getActualTime() {
        return actualTime;
    }

    /**
     * Setter for the actual time.
     * @param actualTime Sets the actual time it took to get the actual time for the task to be completed.
     * @author Miguel Rosario - Generated
     */
    public void setActualTime(double actualTime) {
        this.actualTime = actualTime;
    }

    /**
     * Check to see if the current task is active or not.
     * @return true/false
     * @author Miguel Rosario - Generated
     */
    boolean isActive() {
        return isActive;
    }

    /**
     * Set a task to active or inactive
     * @param active boolean
     */
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * Returns date/time in MM DD YYYY, HH MM SS format
     * @return String that contains the date and time.
     * @author Miguel Rosario
     */
    public static String getTotalDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E: MM/dd/yyyy \nHH:mm:ss a z");
        return formatter.format(calendar.getTime());
    }

    /**
     * Helper function that solely returns the time in HH MM SS format.
     * @return timeString
     * @author Miguel Rosario
     */
    public static String getTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(calendar.getTime());
    }

    /**
     * Helper function that solely returns the date in MM DD YYYY format.
     * @return dateString
     * @author Miguel Rosario
     */
    public static String getDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(calendar.getTime());
    }

    /**
     * Helper function that solely returns the timezone of the user.
     * @return timeZone
     * @author Miguel Rosario
     */
    public static String getTimeZone(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("z");
        return formatter.format(calendar.getTime());
    }

    /**
     * returns a non abbreviated version of the calendar dates because why not.
     * @return Day/String
     * @author Miguel Rosario
     */
    public static String getDays(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E");
        String day = formatter.format(calendar.getTime());
        switch(day){
            case "Sun":
                return "Sunday";

            case "Mon":
                return "Monday";

            case "Tue":
                return "Tuesday";

            case "Wed":
                return "Wednesday";

            case "Thu":
                return "Thursday";

            case "Fri":
                return "Friday";

            case "Sat":
                return "Saturday";

            default:
                return day;

        }
    }

    /**
     * Override toString method that displays the stats
     * @author Miguel Rosario
     */
    @Override
    public String toString() {
        return "Stats{" +
                "dateAssigned='" + dateAssigned + '\'' +
                ", dateCompleted='" + dateCompleted + '\'' +
                ", estimateTime=" + estimateTime +
                ", actualTime=" + actualTime +
                ", isActive=" + isActive +
                '}';
    }

    /**
     * Test cases
     * @author Miguel Rosario
     */
    public static void main(String[] args) {
        String totalDate = getTotalDate();
        String time = getTime();
        String date = getDate();
        String timeZone = getTimeZone();
        System.out.println(date + "\n" + time + "\n" + totalDate + "\n" + timeZone);
        String day = getDays();
        System.out.println(day);
    }

}