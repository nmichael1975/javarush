package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        int max_len = -1;
        int min_len = 999999999;
        int max_indx = -1;
        int min_indx = -1;
        for (int i = 0; i < 10; i++) {
            String tt = scanner.nextLine();
            lst.add(tt);
            if (tt.length() > max_len) {
                max_len = tt.length();
                max_indx = i;
            }
            if (tt.length() < min_len) {
                min_len = tt.length();
                min_indx = i;
            }
        }
        if (max_indx < min_indx)
            System.out.println(lst.get(max_indx));
        else
            System.out.println(lst.get(min_indx));
    }
}
