package com.javalearn.converter;

import java.util.*;
import java.util.stream.Collectors;

public class ConverterImpl implements Converter{
    @Override
    public int sendRimNum (String num)throws NullPointerException {
        HashMap<String, Integer> rimNum = new HashMap<>();
        rimNum.put("I", 1);
        rimNum.put("II", 2);
        rimNum.put("III", 3);
        rimNum.put("IV", 4);
        rimNum.put("V", 5);
        rimNum.put("VI", 6);
        rimNum.put("VII", 7);
        rimNum.put("VIII", 8);
        rimNum.put("IX", 9);
        rimNum.put("X", 10);
        return rimNum.get(num);
    }

    @Override
    public void getRimNum(int num) {
        String[] rnChars = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
        int[] rnVals = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String retVal = "";

        for (int i = 0; i < rnVals.length; i++) {
            int numberInPlace = num / rnVals[i];
            if (numberInPlace == 0) continue;
            retVal += numberInPlace == 4 && i > 0? rnChars[i] + rnChars[i - 1]:
                    new String(new char[numberInPlace]).replace("\0",rnChars[i]);
            num = num % rnVals[i];
        }
        System.out.println(retVal);
    }

    @Override
    public Object stringNum(String strVal){
        int number = Integer.parseInt(strVal);
        if(number <= 10 && number >= 1){
            return number;
        }else {
            return null;
        }
    }

    @Override
    public  List<String> split(String arr) {
        List<String> listVal = new ArrayList<>();
        String [] strNumb = arr.split("[+-/*]");
        listVal.addAll(Arrays.asList(strNumb));
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '/' || arr.charAt(i) == '*' || arr.charAt(i) == '-' || arr.charAt(i) == '+') {
                listVal.add(String.valueOf(arr.charAt(i)));
            };
        }
        return listVal;
    }

    @Override
    public Object calculate(String action, int firstNum, int secondNum) {
        switch (action){
            case "+":
                return  firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "/":
                return firstNum / secondNum;
            case "*":
                return firstNum * secondNum;
            default:
                return null;
        }
    }
}
