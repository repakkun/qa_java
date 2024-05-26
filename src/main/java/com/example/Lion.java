package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Male".equals(sex)) {
            hasMane = true;
        } else if ("Female".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Exception");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}