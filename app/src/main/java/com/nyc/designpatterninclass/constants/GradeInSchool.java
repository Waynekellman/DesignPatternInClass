package com.nyc.designpatterninclass.constants;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public enum GradeInSchool {
    KINDERGARDEN("Starting grade"),
    FIRSTGRAGE("First grade"),
    SECONDGRADE("Second grade"),
    THIRDGRADE("Third grade"),
    FOURTHGRADE("Fourth grade"),
    FIFTHGRADE("Fifth grade"),
    SIXTHGRADE("Sixth grade"),
    SEVENTHGRADE("Seventh grade"),
    EIGHTHGRADE("Eighth grade"),
    NINTHGRADE("Ninth grade"),
    TENTHGRADE("tenth grade"),
    ELEVENTHGRADE("Eleven grade"),
    TWELFTHGRADE("Twelfth grade"),
    FRESHMAN("Freshman"),
    SOPHOMORE("Sophomore"),
    JUNIOR("Junior"),
    SENIOR("Senior");


    private String text;

    GradeInSchool(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
