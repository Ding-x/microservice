package com.dustyding.microservice.limitesservice.bean;

public class LimitConfig {

    private int max, min;

    protected LimitConfig() {

    }


    public LimitConfig(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
