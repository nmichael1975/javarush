package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if (a >= b && a >= c) {
            System.out.print(""+a+" ");
            if ( b >= c)
                System.out.println(""+b+" "+c);
            else
                System.out.println(""+c+" "+b);
        }
        else if(b >= a && b >= c) {
            System.out.print(""+b+" ");
            if ( a >= c)
                System.out.println(""+a+" "+c);
            else
                System.out.println(""+c+" "+a);
        }
        else {
            System.out.print(""+c+" ");
            if ( b >= a)
                System.out.println(""+b+" "+a);
            else
                System.out.println(""+a+" "+b);
        }

    }

}
