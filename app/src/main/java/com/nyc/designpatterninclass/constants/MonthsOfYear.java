package com.nyc.designpatterninclass.constants;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public enum MonthsOfYear {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");
    private String text;

    MonthsOfYear(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
