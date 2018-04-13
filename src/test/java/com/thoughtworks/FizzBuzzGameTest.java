package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.Assert.assertEquals;
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
                "1", "2", "Fizz", "4", "5", "Fizz", "7", "8", "Fizz", "10",
                "11", "Fizz", "Fizz"
        );
        fizzBuzzGame.start(13);
        assertEquals(fizzBuzzGame.getResults(), expectedResults);
    }

    //3的倍数
    @Test
    public void should_return_Fizz_when_is_3_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz","4", "5", "Fizz"
        );
        fizzBuzzGame.start(6);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //5的倍数
    @Test
    public void should_return_Buzz_when_is_5_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz"
        );
        fizzBuzzGame.start(5);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //7的倍数
    @Test
    public void should_return_Whizz_when_is_7_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz"
        );
        fizzBuzzGame.start(7);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //是3和5的倍数同时不包含3的最小的数是15
    @Test
    public void should_return_FizzBuzz_when_is_15_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz"
        );
        fizzBuzzGame.start(15);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //是3和7的倍数同时不包含3的最小的数是21
    @Test
    public void should_return_FizzWhizz_when_is_21_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz"
        );
        fizzBuzzGame.start(21);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //是5和7的倍数同时不包含3的最小的数是70
    @Test
    public void should_return_BuzzWhizz_when_is_35_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz"
        );
        fizzBuzzGame.start(70);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    //是3、5、7的倍数同时不包含3的最小的数是105
    @Test
    public void should_return_FizzBuzzWhizz_when_is_105_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz",
                "101","Fizz","Fizz","104","FizzBuzzWhizz"
        );
        fizzBuzzGame.start(105);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }
    

}
