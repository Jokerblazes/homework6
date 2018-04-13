package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;
    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    //包含数字3
    //13 中包含3
    @Test
    public void should_return_Fizz_when_have_3() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz"
        );
        fizzBuzzGame.start(13);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }
}
