package com.nyc.designpatterninclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nyc.designpatterninclass.constants.ColorsInRainbow;
import com.nyc.designpatterninclass.constants.DeckOfCards;
import com.nyc.designpatterninclass.constants.GradeInSchool;
import com.nyc.designpatterninclass.constants.MonthsOfYear;
import com.nyc.designpatterninclass.constants.PhasesOfMoon;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (ColorsInRainbow c: ColorsInRainbow.values()) {
            Log.d(TAG, c.toString());
        }

        for (DeckOfCards d : DeckOfCards.values()) {
            Log.d(TAG,d.toString());
        }

        for (GradeInSchool g : GradeInSchool.values()) {
            Log.d(TAG,g.toString());
        }
        for (MonthsOfYear m : MonthsOfYear.values()) {
            Log.d(TAG,m.toString());
        }
        for (PhasesOfMoon p : PhasesOfMoon.values()) {
            Log.d(TAG,p.toString());
        }
    }
}
