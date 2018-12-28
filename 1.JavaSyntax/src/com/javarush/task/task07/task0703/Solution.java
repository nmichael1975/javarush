package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] aStr = new String[10];
        int[] aInt = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            aStr[i] = scanner.nextLine();
            aInt[i] = aStr[i].length();
        }

        for (int i = 0; i < aInt.length; i++) {
            System.out.println(aInt[i]);
        }

    }
}
