package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            lst.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            String q = lst.get(0);
            lst.remove(0);
            lst.add(lst.size(), q);
        }

        for (String q : lst) {
            System.out.println(q);
        }
    }
}
