package com.example;

import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FelineTest {

    Feline underTest;


    @Before
    public void init() {
        underTest = new Feline();
    }

    @Test
    public void checkEatMeatPredator() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String>  actual = underTest.eatMeat();

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    public void checkGetFamilyCats() {
        String expected = "Кошачьи";
        String actual = underTest.getFamily();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkGetKittensNoArgument() {
        int expected = 1;
        int actual = underTest.getKittens();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkGetKittensArgument() {
        int expected = 4;
        int actual = underTest.getKittens(4);

        assertThat(actual).isEqualTo(expected);
    }





}