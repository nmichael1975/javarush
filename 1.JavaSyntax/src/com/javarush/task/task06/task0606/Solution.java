package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(str.substring(i,i+1)) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
