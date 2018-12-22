package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int res = 0;

        if (a > 0)
            res += 1;

        if (b > 0)
            res += 1;

        if (c > 0)
            res += 1;

        System.out.println(res);
    }
}
