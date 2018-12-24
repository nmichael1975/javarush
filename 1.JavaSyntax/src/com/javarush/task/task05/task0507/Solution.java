package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean isFirst = true;
        float summ = 0;
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == -1)
            break;
            summ += number;
            cnt ++;
        }
        System.out.println(summ / cnt);
    }
}

