package com.javalearn;

import com.javalearn.converter.Converter;
import com.javalearn.converter.ConverterImpl;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().toUpperCase();
        String res = val.replaceAll("\\s+","");

        calculator.calculateVal(res);

    }
}
