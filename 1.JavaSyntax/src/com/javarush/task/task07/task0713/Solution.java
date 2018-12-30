package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lst_source = new ArrayList<Integer>();

        ArrayList<Integer> lst_3 = new ArrayList<Integer>();
        ArrayList<Integer> lst_2 = new ArrayList<Integer>();
        ArrayList<Integer> lst_non = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            lst_source.add(scanner.nextInt());
        }

        for (Integer x :lst_source) {
            if (x%2 == 0)
                lst_2.add(x);

            if (x%3 == 0)
                lst_3.add(x);

            if (x%2 != 0 && x%3 != 0)
                lst_non.add(x);
        }

        printList(lst_3);
        printList(lst_2);
        printList(lst_non);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list)
            System.out.println(x);
    }
}
