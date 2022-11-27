package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    String sex;
    private Felines feline;
    public Lion(Felines feline, String sex){
        this.feline = feline;
        this.sex = sex;
    }

    public Lion() throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
