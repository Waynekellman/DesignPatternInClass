package com.nyc.designpatterninclass.constants;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public enum PhasesOfMoon {
    PARTIAL("Partial Moon"),
    HALF("Half Moon"),
    FULL("Full Moon"),
    NEWMOON("New Moon");
    private String text;

    PhasesOfMoon(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
