package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午12:17 2018/4/14
 */
public class FizzBuzzGameTestV2 {
    private FizzBuzzGameV2 fizzBuzzGame;
    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGameV2();
    }

    //包含数字3
    //13 中包含3
    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1OrNumber(6),"6");
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1OrNumber(13), "Fizz");
    }


    //3的倍数
    @Test
    public void should_return_Fizz_when_is_3_multiple() {
        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1OrNumber(3),"Fizz");
        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1OrNumber(5),"5");
    }

    //5的倍数
    @Test
    public void should_return_Buzz_when_is_5_multiple() {
        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(5),"Buzz");
        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(10),"Buzz");
        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(4),"4");
    }

}
