package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

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
        assertEquals(fizzBuzzGame.getFizzOrNumber(6),"6");
        assertEquals(fizzBuzzGame.getFizzOrNumber(13), "Fizz");
    }


}
