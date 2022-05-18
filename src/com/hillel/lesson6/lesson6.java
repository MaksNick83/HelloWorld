package com.hillel.lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        int i = 0;
        int k = 1;
//1.
        do {
            if ((k % 2) == 0) {
                System.out.println("ПарЧисло" + k);
                i++;
            }
            k++;
        } while (i != 10);

//2.
        int k1 = 10;
        while (k1 != 0) {
            System.out.println("Тик" + k1--);

        }
      /*  Зробити цикли на визначення позитивного цілого числа із консолі. Використати цикл do while
        - Ввести із консолі щось
                - Якщо це double або String, то вивести повідомлення, що це не ціле позитивне число та попросити спробувати ще
                - Якщо це int, але негативне число, вивести повідомлення, що потрібно саме позитивне
                - Якщо число int вивести його та подякувати.

                Enter number :55.56
        It's not a number. Please enter an integer number
        Enter number :іва
        It's not a number. Please enter an integer number
        Enter number :-45
        Enter positive number
        Enter number :4
        Thank you your entered positive number is 4*/
        boolean usl = false;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть позитивне ціле число: ");
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a > 0) {
                    usl = true;
                } else {
                    System.out.println("Потрібно саме позитивне");
                }

            } else {
                System.out.println("Хочу ціле позитивне число");
            }
        } while (!usl);
//3.
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a + " " + b + " ");

        for (int i2 = 3; i2 <= 11; i2++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c + " ");
        }



  /*      for (int i = 1; i <= 10; i++) {
            System.out.println("cycle:" + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("cycle:" + i);
        }
        int i = 0;
        int limit = 20;
        while (i < limit) {
            i++;
            System.out.println("cycle:" + i);
        }
        do {
            System.out.println("cycle:" + i--);
        } while (i > 0)*/


    }
}
