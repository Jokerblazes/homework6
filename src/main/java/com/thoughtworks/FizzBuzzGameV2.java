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
    private int num2 = 5;
    private int num3 = 7;

    public List<String> getResults() {
        return results;
    }
    
    public void start(int count) {
        String result;
        for (int i = 1; i <= count ; i++) {
            result = "";
            if (isContainNumber1(i)) {
                result = getFizzIfContainNumber1(i);
            } else {
                result += getFizzIfMultipleOfNumber1(i);
                result += getBuzzIfMultipleOfNumber2(i);
                result += getWhizzIfMultipleOfNumber3(i);
            }
            if(result.equals("")){
                result = String.valueOf(i);
            }
            results.add(result);
        }
    }

    public String getFizzIfMultipleOfNumber1(int num){
        return isMultipleOfNumber1(num) ? "Fizz" : "";
    }

    public String getBuzzIfMultipleOfNumber2(int num){
        return isMultipleOfNumber2(num) ? "Buzz" : "";
    }

    public String getWhizzIfMultipleOfNumber3(int num){
        return isMultipleOfNumber3(num) ? "Whizz" : "";
    }


    public String getFizzIfContainNumber1(int num) {
        return isContainNumber1(num) ? "Fizz" : "";
    }

   private boolean isContainNumber1(int num) {
       if (num / 10 == 0)
           return num == num1;
       return num % 10 == num1 || isContainNumber1(num / 10);
   }

    private boolean isMultipleOfNumber1(int num) {
        return num % num1 == 0;
    }

    private boolean isMultipleOfNumber2(int num) {
        return num % num2 == 0;
    }

    private boolean isMultipleOfNumber3(int num) {
        return num % num3 == 0;
    }

//    public String getFizzIfMultipleOfNumber1OrNumber(int num) {
//        return isMultipleOfNumber1(num) ? "Fizz" : String.valueOf(num);
//    }

//    public String getBuzzIfMultipleOfNumber2OrNumber(int num) {
//        return isMultipleOfNumber2(num) ? "Buzz" : String.valueOf(num);
//    }

    

//    public String getWhizzIfMultipleOfNumber3OrNumber(int num) {
//        return isMultipleOfNumber3(num) ? "Whizz" : String.valueOf(num);
//    }

    


//    public String getFizzBuzzOrNumber(int num) {
//        if (isMultipleOfNumber1(num) && isMultipleOfNumber2(num))
//            return "FizzBuzz";
//        return String.valueOf(num);
//    }
//
//    public String getFizzWhizzOrNumber(int num) {
//        return (isMultipleOfNumber1(num) && isMultipleOfNumber3(num))
//                ? "FizzWhizz" : String.valueOf(num);
//    }
//
//    public String getBuzzWhizzOrNumber(int num) {
//        return (isMultipleOfNumber2(num) && isMultipleOfNumber3(num))
//                ? "BuzzWhizz" : String.valueOf(num);
//    }
//
//    public String getFizzBuzzWhizzOrNumber(int num) {
//        return (isMultipleOfNumber1(num) && isMultipleOfNumber2(num) && isMultipleOfNumber3(num))
//                ? "FizzBuzzWhizz" : String.valueOf(num);
//    }
}
