package com.hillel.lesson3;

import java.util.Scanner;

public class MathLibraryOperation {
    public static void main(String[] args) {
        int abs = Math.abs(-15); // модуль
        double sqrt = Math.sqrt(64);//корынь кквадратный
        double pow = Math.pow(5,3);//число в встепени
        double p  = Math.pow(125,1.0/3);//коринь кубичный
        long round = Math.round(p);//округлення
        int random = (int)(Math.random()*10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        String next = scanner.next();
        System.out.println("Enter b: ");
        int nextInt = scanner.nextInt();

        System.out.println("next string "+ next);
        System.out.println("next int "+ nextInt);



        System.out.println("abs = " + abs);
        System.out.println("s = " + sqrt);
        System.out.println("pow = " + pow);
        System.out.println("pow 1/3 = " + p);
        System.out.println("round = " + round);
        System.out.println("random = " + random);


    }
}
