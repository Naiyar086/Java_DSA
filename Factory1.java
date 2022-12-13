package com.bytecode.factory;

import com.bytecode.child.*;
import com.byetcode.abstract1.Courier1;

public class Factory1 {
    public static Courier1 getObject(String obj1) {
        if(obj1.equals("Bluedart")){
            return new Bluedart;
        }
        else if (obj1.equals(Ekart)){
            return new Ekart;
        }
        return null;
    }
}
