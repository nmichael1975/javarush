package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            lst.add(0, scanner.nextLine());
        }

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}
