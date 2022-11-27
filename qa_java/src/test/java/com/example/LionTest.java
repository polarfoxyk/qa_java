package com.example;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    private TestCase Assertions;

    @Test
    public void testGetKittens(){

        Lion lion = new Lion(feline, "Самец");
        lion.getKittens();
        Mockito.verify(feline).getKittens();

    }

    @Test
    public void testDoesHaveMane(){

        Lion lion = new Lion(feline, "Самец");
        boolean c = lion.doesHaveMane();
        Assertions.assertEquals( lion.hasMane, c);
    }

    @Test
    public void testGetFood() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");;
    }

    }

