package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        /*Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.*/
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0)
            num *= 2;
        else if (num < 0)
            num += 1;

        System.out.println(num);

    }

}