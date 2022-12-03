package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@RunWith(Parameterized.class)
public class LionTest {
    private final String Sex;
    private final boolean hasMane;

    Feline felineMock = Mockito.mock(Feline.class);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public LionTest(String Sex, boolean hasMane) {
        this.Sex = Sex;
        this.hasMane = hasMane;
    }


    @Parameterized.Parameters
    public static Object[][] getHasManeForSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion underTest = new Lion(Sex);
        boolean actual = underTest.doesHaveMane();

            assertThat(actual).isEqualTo(hasMane);

        }





    @Test
    public void checkGetKittens() throws Exception {
        Lion underTest = new Lion(Sex);
        int expected = 1;
        when(felineMock.getKittens()).thenReturn(1);
        int actual = underTest.getKittens();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion underTest = new Lion(Sex);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.getFood("Хищник")).thenReturn(expected);
        List<String> actual = underTest.getFood();
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception{
        Lion underTest = new Lion("Неведомая зверушка");
        underTest.doesHaveMane();


    }

}
