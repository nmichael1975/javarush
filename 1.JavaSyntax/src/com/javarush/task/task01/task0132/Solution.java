package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int res = 0;
        res += number/100;
        res += (number - (number/100)*100)/10;
        res += number - (number/10)*10;

        return res;
    }
}