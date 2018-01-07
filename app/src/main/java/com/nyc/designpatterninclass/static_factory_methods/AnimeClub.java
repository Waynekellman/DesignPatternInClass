package com.nyc.designpatterninclass.static_factory_methods;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class AnimeClub {
    private static AnimeClub animeClubInstance;

    private AnimeClub(){

    }
    public static AnimeClub getAnimeClubInstance(){
        if(animeClubInstance != null){
            return new AnimeClub();
        }
        animeClubInstance = new AnimeClub();
        return animeClubInstance;
    }
}
