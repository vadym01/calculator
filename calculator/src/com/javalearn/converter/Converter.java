package com.javalearn.converter;

import java.util.List;

public interface Converter {
    int sendRimNum(String num);
    void getRimNum(int num);
    Object stringNum(String strVal);
    List<String> split(String str);
    Object calculate(String action, int firstNum, int secondNum);
}
