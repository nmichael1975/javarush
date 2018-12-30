package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            str.add(scanner.nextLine());
        }

        int min = 999999999;
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() < min)
                min = str.get(i).length();
        }

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == min)
                System.out.println(str.get(i));
        }
    }
}
