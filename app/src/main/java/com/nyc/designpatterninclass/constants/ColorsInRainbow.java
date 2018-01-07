package com.nyc.designpatterninclass.constants;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public enum ColorsInRainbow {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    private String text;

    ColorsInRainbow(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }


}
