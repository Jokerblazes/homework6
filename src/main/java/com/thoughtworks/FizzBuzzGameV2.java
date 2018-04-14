package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午12:18 2018/4/14
 */
public class FizzBuzzGameV2 {
    private List<String> results = new ArrayList<>();
    private int num1 = 3;
    public void start(int count) {
    }


    public String getFizzOrNumber(int num) {
        return isContainNumber1(num) ? "Fizz" : String.valueOf(num);
    }

   private boolean isContainNumber1(int num) {
       if (num / 10 == 0)
           return num == num1;
       return num % 10 == num1 || isContainNumber1(num / 10);
   }



    public List<String> getResults() {
        return results;
    }
}
