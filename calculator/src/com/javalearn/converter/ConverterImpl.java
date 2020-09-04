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
        HashMap<Integer, String> rimNum = new HashMap<>();
        rimNum.put(1,"I");
        rimNum.put(2,"II");
        rimNum.put(3,"III");
        rimNum.put(4,"IV");
        rimNum.put(5,"V");
        rimNum.put(6,"VI");
        rimNum.put(7,"VII");
        rimNum.put(8,"VIII");
        rimNum.put(9,"IX");
        rimNum.put(10,"X");
        rimNum.put(11,"XI");
        rimNum.put(12,"XII");
        rimNum.put(13,"XIII");
        rimNum.put(14,"XIV");
        rimNum.put(15,"XV");
        rimNum.put(16,"XI");
        rimNum.put(17,"XII");
        rimNum.put(18,"XIII");
        rimNum.put(19,"XIX");
        rimNum.put(20,"XX");
        String res = rimNum.get(num);
        System.out.println(res);
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
