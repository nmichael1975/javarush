package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("111");
        lst.add("222");
        lst.add("333");
        lst.add("444");
        lst.add("555");

        System.out.println(lst.size());

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}
