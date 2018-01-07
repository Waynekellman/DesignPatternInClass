package com.nyc.designpatterninclass.constants;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public enum DeckOfCards {
    ACE("Waterfall"),
    KING("Make a rule"),
    QUEENS("Question"),
    JACK("Never have I ever"),
    TEN("Sentence"),
    NINE("Bust-A-Rhyme"),
    EIGHT("Pick a date"),
    SEVEN("Heaven"),
    SIX("Chicks"),
    FIVE("Guys"),
    FOUR("Floor"),
    THREE("Me"),
    TWO("You");

    private String text;

    DeckOfCards(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
