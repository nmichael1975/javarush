package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        Collections.addAll(str, "мама", "мыла", "раму");
        str.add(1, "именно");
        str.add(3, "именно");
        str.add("именно");

        for (String x : str)
            System.out.println(x);
    }
}
