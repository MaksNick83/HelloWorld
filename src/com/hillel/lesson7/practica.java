package com.hillel.lesson7;

import java.util.Random;

public class practica {
    public static void main(String[] args) {
       /* От Andrii Shurda всем 01:54 PM
        1. вивести на екран в один рядок усі цифри, розділивши їх комою, але у останнього елементу не виводити кому
       */
        int[] array = new int[10];
        Random random = new Random();
        int a = 100;
        int randomInt = 10 + random.nextInt(a + 1);

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(a + 1);
            System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
        }

        System.out.println();

        /*
       2. У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного встановлено ймовірність того, що він був убивцею.
         Всі ці ймовірності записані як масиву чисел. Написати функцію, яка й визначить номер підозрюваного, якого треба ув'язнити.
       */
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);



        /*      3. У вашій баскетбольній команді 10 людей. Бали гравців основного складу записані у парні комірки масиву,
                а запасних гравців – у непарних. Написати функцію, яка знайде наскільки більше очок, заробив основний склад
        по відношенню до запасних гравців.*/


    }
}
