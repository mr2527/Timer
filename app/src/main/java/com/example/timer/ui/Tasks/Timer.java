package com.example.timer.ui.Tasks;

/**
 *
 */
public class Timer {
    private float startTimer;
    private float endTimer;

    /**
     *
     * @return
     */
    public float getStartTimer() {
        return startTimer;
    }

    /**
     *
     * @param startTimer
     */
    public void setStartTimer(float startTimer) {
        this.startTimer = startTimer;
    }

    /**
     *
     * @return
     */
    public float getEndTimer() {
        return endTimer;
    }

    /**
     *
     * @param endTimer
     */
    public void setEndTimer(float endTimer) {
        this.endTimer = endTimer;
    }

    /**
     *
     * @param startTimer
     * @param endTimer
     */
    public Timer(float startTimer, float endTimer) {
        this.startTimer = startTimer;
        this.endTimer = endTimer;

    }

    @Override
    public String toString() {
        return "Timer{" +
                "startTimer=" + startTimer +
                ", endTimer=" + endTimer +
                '}';
    }
}