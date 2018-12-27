package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayInt.add(Integer.parseInt(reader.readLine()));
        }
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < arrayInt.size() - 1; i++) {
                if (arrayInt.get(i) > arrayInt.get(i + 1)) {
                    flag = true;
                    int temp = arrayInt.get(i);
                    arrayInt.set(i, arrayInt.get(i + 1));
                    arrayInt.set(i + 1, temp);
                }
            }
        }

        for (int i = 0; i < arrayInt.size(); i++) {
            System.out.println(arrayInt.get(i));
        }
    }
}
