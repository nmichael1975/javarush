package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println(name + " получает "+ int1 + " через " + int2 +" лет.");
    }
}
