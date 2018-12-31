package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();

        while (true) {
            String q = reader.readLine();
            if (q.equals("end"))
                break;

            lst.add(q);
        }

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}