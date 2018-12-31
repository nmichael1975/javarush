package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grFather1 = new Human("grFather1" , true, 60);
        Human grFather2 = new Human("grFather2" , true, 65);
        Human grMother1 = new Human("grMother1" , false, 50);
        Human grMother2 = new Human("grMother2" , false, 55);
        Human father1 = new Human("Father1" , true, 35, grFather1, grMother1);
        Human mother1 = new Human("Mother1" , false, 30, grFather2, grMother2);
        Human chaild1 = new Human("Chaild1" , false, 15, father1, mother1);
        Human chaild2 = new Human("Chaild2" , true, 10, father1, mother1);
        Human chaild3 = new Human("Chaild3" , false, 5, father1, mother1);


        System.out.println(grFather1.toString());
        System.out.println(grFather2.toString());
        System.out.println(grMother1.toString());
        System.out.println(grMother2.toString());
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(chaild1.toString());
        System.out.println(chaild2.toString());
        System.out.println(chaild3.toString());

    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}