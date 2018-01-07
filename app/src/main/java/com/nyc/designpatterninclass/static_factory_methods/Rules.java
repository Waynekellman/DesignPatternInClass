package com.nyc.designpatterninclass.static_factory_methods;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class Rules {
    private static Rules rulesInstance;

    private Rules(){

    }
    public static Rules getAnimeClubInstance(){
        if(rulesInstance != null){
            return new Rules();
        }
        rulesInstance = new Rules();
        return rulesInstance;
    }
}
