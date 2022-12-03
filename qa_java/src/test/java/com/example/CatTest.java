package com.example;

import org.assertj.core.api.ThrowableAssert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline felineMock;

    Cat underTest;

    @Before
    public void init() {
        underTest = new Cat(felineMock);
    }

    @Test
    public void checkGetSoundMyau() {
        String expected = "Мяу";
        String actual = underTest.getSound();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkGetFoodMeat() throws Exception {
        List<String>  expected = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.eatMeat()).thenReturn(expected);

        List<String> actual = underTest.getFood();

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    public void checkExceptionOnGetFood() throws Exception {
        Exception expected = new RuntimeException("any_91883");
        doThrow(expected).when(felineMock).eatMeat();

        ThrowableAssert.ThrowingCallable actual = () -> underTest.getFood();
        assertThatThrownBy(actual)
            .isEqualTo(expected);
    }
}