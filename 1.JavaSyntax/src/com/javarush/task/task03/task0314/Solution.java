package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        while (i < 11) {
            int j = 1;
            String str = "";
            while (j < 11) {
                if (j > 1)
                    str = str + " ";
                str = str + i*j;
                j++;
            }
            System.out.println(str);
            i++;
        }
    }
}
