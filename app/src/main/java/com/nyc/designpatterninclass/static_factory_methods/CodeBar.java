package com.nyc.designpatterninclass.static_factory_methods;

/**
 * Created by Wayne Kellman on 1/7/18.
 */

public class CodeBar {

    private static CodeBar codeBarInstance;

    private CodeBar(){

    }
    public static CodeBar getCodeBarInstance(){
        if(codeBarInstance != null){
            return new CodeBar();
        }
        codeBarInstance = new CodeBar();
        return codeBarInstance;
    }
}
