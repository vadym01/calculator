package com.javalearn;

import com.javalearn.converter.Converter;
import com.javalearn.converter.ConverterImpl;

import java.util.List;


public class Calculator {
    Converter converter = new ConverterImpl();


    public void calculateVal(String input){

        List<String> val = converter.split(input);
        int firstNum;
        int secondNum;
        String action;

        try {
            if(val.size() == 3){
                if(val.get(0).chars().allMatch( Character::isDigit ) && val.get(1).chars().allMatch( Character::isDigit )){
                    firstNum = (int) converter.stringNum(val.get(0));
                    secondNum = (int) converter.stringNum(val.get(1));
                    action = val.get(2);
                    int result = (int) converter.calculate(action,firstNum,secondNum);
                    System.out.println(result);
                }else{
                    firstNum = converter.sendRimNum(val.get(0));
                    secondNum = converter.sendRimNum(val.get(1));
                    action = val.get(2);
                    int res = (int) converter.calculate(action,firstNum,secondNum);
                    converter.getRimNum(res);
                }
            }
        }catch (NullPointerException e){
        }


    }

}