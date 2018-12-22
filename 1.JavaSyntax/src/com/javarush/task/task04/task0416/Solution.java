package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        float num = (new Scanner(System.in)).nextFloat();

        if (num%5 >= 0 && num%5 < 3)
            System.out.println("зелёный");
        else if (num%5 >= 3 && num%5 < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}