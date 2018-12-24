package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean res;
        if (this.strength > anotherCat.strength)
            res = true;
        else if (this.strength < anotherCat.strength)
            res = false;
        else {
            //если сила равна
            if (this.weight > anotherCat.weight)
                res = true;
            else if (this.weight < anotherCat.weight)
                res = false;
            else {
                // если сила и вес равны
                if (this.age > anotherCat.age)
                    res = false;
                else
                    res = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
