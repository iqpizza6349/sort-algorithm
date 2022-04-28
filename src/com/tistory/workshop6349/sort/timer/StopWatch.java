package com.tistory.workshop6349.sort.timer;

public class StopWatch {
    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    private boolean stopWatchRunning = false;

    public void start() {
        this.stopWatchStartTime = System.nanoTime();
        this.stopWatchRunning = true;
        System.out.println("[타이머 시작]");
    }

    public void stop() {
        this.stopWatchStopTime = System.nanoTime();
        this.stopWatchRunning = false;
        System.out.println("[타이머 종료]");
    }

    public long getElapsedMilliseconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        long nanoSecondsPerMillisecond = 1000000;
        return elapsedTime / nanoSecondsPerMillisecond;
    }

    public long getElapsedNanoseconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        return elapsedTime;
    }

    public long getElapsedSeconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        long nanoSecondsPerSecond = 1000000000;
        return elapsedTime / nanoSecondsPerSecond;
    }
}