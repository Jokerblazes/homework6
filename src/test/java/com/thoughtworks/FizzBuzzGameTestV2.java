package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
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
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1(13), "Fizz");
    }


    @Test
    public void should_return_empty_string_when_not_have_3() {
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1(4), "");
    }
    //3的倍数
//    @Test
//    public void should_return_Fizz_when_is_3_multiple() {
//        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1OrNumber(3),"Fizz");
//        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1OrNumber(5),"5");
//    }
//
//    //5的倍数
//    @Test
//    public void should_return_Buzz_when_is_5_multiple() {
//        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(5),"Buzz");
//        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(10),"Buzz");
//        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2OrNumber(4),"4");
//    }
//
//    //7的倍数
//    @Test
//    public void should_return_Whizz_when_is_7_multiple() {
//        assertEquals(fizzBuzzGame.getWhizzIfMultipleOfNumber3OrNumber(7),"Whizz");
//        assertEquals(fizzBuzzGame.getWhizzIfMultipleOfNumber3OrNumber(14),"Whizz");
//        assertEquals(fizzBuzzGame.getWhizzIfMultipleOfNumber3OrNumber(16),"16");
//    }
//
//    //是3和5的倍数同时不包含3的最小的数是15
//    @Test
//    public void should_return_FizzBuzz_when_is_15_multiple() {
//        assertEquals(fizzBuzzGame.getFizzBuzzOrNumber(3),"3");
//        assertEquals(fizzBuzzGame.getFizzBuzzOrNumber(5),"5");
//        assertEquals(fizzBuzzGame.getFizzBuzzOrNumber(15),"FizzBuzz");
//    }
//
//    //是3和7的倍数同时不包含3的最小的数是21
//    @Test
//    public void should_return_FizzWhizz_when_is_21_multiple() {
//        assertEquals(fizzBuzzGame.getFizzWhizzOrNumber(3),"3");
//        assertEquals(fizzBuzzGame.getFizzBuzzOrNumber(7),"7");
//        assertEquals(fizzBuzzGame.getFizzBuzzOrNumber(21),"21");
//    }
//
//    //是5和7的倍数同时不包含3的最小的数是70
//    @Test
//    public void should_return_BuzzWhizz_when_is_35_multiple() {
//        assertEquals(fizzBuzzGame.getBuzzWhizzOrNumber(5),"5");
//        assertEquals(fizzBuzzGame.getBuzzWhizzOrNumber(7),"7");
//        assertEquals(fizzBuzzGame.getBuzzWhizzOrNumber(35),"BuzzWhizz");
//    }
//
//    //是3、5、7的倍数同时不包含3的最小的数是105
//    @Test
//    public void should_return_FizzBuzzWhizz_when_is_105_multiple() {
//        assertEquals(fizzBuzzGame.getFizzBuzzWhizzOrNumber(3),"3");
//        assertEquals(fizzBuzzGame.getFizzBuzzWhizzOrNumber(5),"5");
//        assertEquals(fizzBuzzGame.getFizzBuzzWhizzOrNumber(7),"7");
//        assertEquals(fizzBuzzGame.getFizzBuzzWhizzOrNumber(105),"FizzBuzzWhizz");
//    }
    
    @Test
    public void should_return_Fizz_when_multiple_of_3(){
        assertThat(fizzBuzzGame.getFizzIfMultipleOfNumber1(6), is("Fizz"));
    }

    @Test
    public void should_return_empty_string_when_not_multiple_of_3(){
        assertThat(fizzBuzzGame.getFizzIfMultipleOfNumber1(7), is(""));
    }

    @Test
    public void should_return_Buzz_when_multiple_of_5(){
        assertThat(fizzBuzzGame.getBuzzIfMultipleOfNumber2(10), is("Buzz"));
    }

    @Test
    public void should_return_empty_string_when_not_multiple_of_5(){
        assertThat(fizzBuzzGame.getBuzzIfMultipleOfNumber2(7), is(""));
    }
    
    @Test
    public void should_return_Whizz_when_multiple_of_7(){
        assertThat(fizzBuzzGame.getWhizzIfMultipleOfNumber3(14), is("Whizz"));
    }

    @Test
    public void should_return_empty_string_when_not_multiple_of_7(){
        assertThat(fizzBuzzGame.getWhizzIfMultipleOfNumber3(20), is(""));
    }
}
