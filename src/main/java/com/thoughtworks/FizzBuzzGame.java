package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int num1 = 3;//第一个数默认值3
    private int num2 = 5;//第二个数默认值5
    private int num3 = 7;//第三个数默认值7

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void start(int count) {
        String result;
        for (int i = 1; i <= count; i++) {
            if (containNum1(i)) {
                result = "Fizz";
            } else {
                result = isMultipleAndReturnResult(i);
                if (result.length() == 0)
                    result = String.valueOf(i);
            }
            results.add(result);
        }
    }

    private boolean containNum1(int num) {
        if (num / 10 == 0)
            return num == num1;
        return num % 10 == num1 || containNum1(num / 10);
    }

    private String isMultipleAndReturnResult(int num) {
        String result = "";
        if (num % num1 == 0) {
            result += "Fizz";
        }
        if (num % num2 == 0) {
            result += "Buzz";
        }
        if (num % num3 == 0)
            result += "Whizz";
        return result;
    }



    public List<String> getResults() {
        return results;
    }
}


