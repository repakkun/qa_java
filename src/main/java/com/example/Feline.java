package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("predator");
    }

    @Override
    public int getKittens() {
        return 1;
    }

    @Override
    public String getFamily() {
        return "feline";
    }
}
