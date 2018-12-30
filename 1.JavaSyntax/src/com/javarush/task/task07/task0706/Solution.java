package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[15];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt_ch = 0;
        int cht_nech = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i+10)%2 == 0)
                cnt_ch += arr[i];
            else
                cht_nech += arr[i];
        }

        if (cnt_ch > cht_nech)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (cnt_ch < cht_nech)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
