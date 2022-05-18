package com.hillel.lesson7;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 100;
        int randomInt = 10 + random.nextInt(a + 1);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(a + 1);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }

        array[0] = randomInt;
        array[2] = 45;

        String[] seasons = {"winter", "spring", "summer", "autumn"};

        for (String season : seasons){
            System.out.println( season);
        }

        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);


    }
}
