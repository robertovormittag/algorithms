package net.robertovormittag.idealab.util;

/**
 * A stop watch to measure running time of algorithms
 */
public class Chronos {

    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public Chronos() {
        reset();
    }

    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }

    public void start() {
        if (isRunning) return;
        isRunning = true;
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!isRunning) return;
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }

    public long getElapsedTime() {
        if (isRunning) {
            long endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        }
        else {
            return elapsedTime;
        }
    }

}
