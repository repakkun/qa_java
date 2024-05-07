package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private Predator predator;

    public Lion(String sex, Predator predator) throws Exception {
        if ("male".equals(sex)) {
            hasMane = true;
        } else if ("female".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Must be male or female");
        }
        this.predator = predator;
    }

    public int getKittens() throws Exception {
        return 3;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
