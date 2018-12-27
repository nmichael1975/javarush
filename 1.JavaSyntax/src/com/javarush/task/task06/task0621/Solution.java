package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFatherName = reader.readLine();
        Cat grFather = new Cat(grFatherName);

        String grMotherName = reader.readLine();
        Cat grMother = new Cat(grMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grMother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grFather);
        System.out.println(grMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            String res = "The cat's name is " + name;

            if (parentMother == null)
                res += ", no mother";
            else
                res += ", mother is " + parentMother.name;

            if (parentFather == null)
                res += ", no father";
            else
                res += ", father is " + parentFather.name;

            return res;
        }
    }

}
