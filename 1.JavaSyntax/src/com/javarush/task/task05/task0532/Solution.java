package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(reader.readLine());
        int maximum;
        if (cnt > 0) {
            maximum = Integer.parseInt(reader.readLine());

            for (int i = 0; i < cnt - 1; i++) {
                int a = Integer.parseInt(reader.readLine());
                maximum = (maximum < a ? a : maximum);
            }


            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
