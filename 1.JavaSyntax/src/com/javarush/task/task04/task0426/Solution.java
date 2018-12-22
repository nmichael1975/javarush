package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0)
            System.out.println("ноль");
        else if (a > 0)
            System.out.print("положительное ");
        else
            System.out.print("отрицательное ");

        if (a!=0 && a%2==0)
            System.out.println("четное число");
        else if (a!=0 && a%2!=0)
            System.out.println("нечетное число");
    }
}
