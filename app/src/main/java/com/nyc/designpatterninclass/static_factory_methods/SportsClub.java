package com.nyc.designpatterninclass.static_factory_methods;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class SportsClub {

    private static SportsClub sportsClubInstance;

    private SportsClub(){

    }

    public static SportsClub getSportsClubInstance(){
        if (sportsClubInstance != null) {
            return new SportsClub();
        }
        sportsClubInstance = new SportsClub();
        return sportsClubInstance;
    }
}
