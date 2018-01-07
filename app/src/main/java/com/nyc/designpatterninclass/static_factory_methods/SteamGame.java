package com.nyc.designpatterninclass.static_factory_methods;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class SteamGame {

    private static SteamGame steamGameInstance;
    private SteamGame(){

    }
    public static SteamGame getSteamGameInstance(){
        if (steamGameInstance != null){
            return steamGameInstance;
        }
        steamGameInstance = new SteamGame();
        return steamGameInstance;
    }
}
