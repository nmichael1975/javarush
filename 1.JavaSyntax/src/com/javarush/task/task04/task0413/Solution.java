package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String monthString;

        switch (num) {
            case 1:
                monthString = "понедельник";
                break;
            case 2:
                monthString = "вторник";
                break;
            case 3:
                monthString = "среда";
                break;
            case 4:
                monthString = "четверг";
                break;
            case 5:
                monthString = "пятница";
                break;
            case 6:
                monthString = "суббота";
                break;
            case 7:
                monthString = "воскресенье";
                break;
            default:
                monthString = "такого дня недели не существует";
                break;
        }
        System.out.println(monthString);
    }
}