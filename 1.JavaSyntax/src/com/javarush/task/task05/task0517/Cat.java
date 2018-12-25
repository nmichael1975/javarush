package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 10;
        this.weight = 15;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 15;
        this.color = "black";
    }



    public Cat(int weight, String color) {
        this.name = null;
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 10;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
