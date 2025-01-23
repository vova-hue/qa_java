package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private  Predator predator;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new InterruptedException("Используйте допустимые значения пола животного - самец или самка");
        }
        this.predator = feline;
    }


    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
