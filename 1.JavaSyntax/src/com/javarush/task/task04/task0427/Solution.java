package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 1 || num > 999)
            return;

        if (num%2 == 0)
            System.out.print("четное ");
        else
            System.out.print("нечетное ");

        if (num < 10)
            System.out.println("однозначное число");
        else if (num < 100)
            System.out.println("двузначное число");
        else
            System.out.println("трехзначное число");
    }
}
