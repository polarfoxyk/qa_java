package com.example;

import java.util.List;

public interface Felines {
    int getKittens();
    List<String> getFood(String хищник) throws Exception;
    List<String> eatMeat() throws Exception;
}
