package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int res_pls = 0;
        int res_min = 0;


        if (a > 0)
            res_pls += 1;
        else if (a < 0)
            res_min += 1;

        if (b > 0)
            res_pls += 1;
        else if (b < 0)
            res_min += 1;

        if (c > 0)
            res_pls += 1;
        else if (c < 0)
            res_min += 1;

        System.out.println("количество отрицательных чисел: " + res_min);
        System.out.println("количество положительных чисел: " + res_pls);

    }
}
