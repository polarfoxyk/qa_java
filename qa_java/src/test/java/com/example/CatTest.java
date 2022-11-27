package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private TestCase Assertions;
    @Mock
    Feline  feline;



    @Test
    public void testGetSound(){
        Cat cat = new Cat(feline);
        cat.getSound();
        Assertions.assertEquals( "Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception{
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}