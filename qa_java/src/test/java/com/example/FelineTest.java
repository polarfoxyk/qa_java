package com.example;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public  class FelineTest {
    private TestCase Assertions;


    @Test
    public void testEatMeat() throws Exception {
    Feline feline = new Feline();
        List<String> eate =  feline.eatMeat();
        List<String> pEate = List.of("Животные", "Птицы", "Рыба");
        Assertions.assertEquals( pEate, eate);
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        Assertions.assertEquals( "Кошачьи", feline.getFamily());

    }

    @Test
    public void testGetKittensZeroArgument(){
        Feline feline = new Feline();
        Assertions.assertEquals( 1, feline.getKittens());

    }
    @Test
    public void testGetKittensNotZeroArgument(){
        Feline feline = new Feline();
        int kittens = 5;
        Assertions.assertEquals( kittens, feline.getKittens(kittens));

    }

}