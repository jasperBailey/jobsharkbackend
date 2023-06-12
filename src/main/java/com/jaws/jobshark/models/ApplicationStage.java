package com.jaws.jobshark.models;

public enum ApplicationStage {
    TO_APPLY(0),
    APPLIED(1),
    TO_INTERVIEW(2),
    AWAITING_OUTCOME(3);


    private final int value;

    ApplicationStage(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
