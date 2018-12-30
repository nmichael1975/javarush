package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            lst.add(scanner.nextLine());
        }
        int len = -1;
        int err = -1;

        for (int i = 0; i < lst.size(); i++) {
            if (len > lst.get(i).length()) {
                err = i;
                break;
            }
            else
                len = lst.get(i).length();
        }

        if ( err > -1)
            System.out.println(err);
    }
}

