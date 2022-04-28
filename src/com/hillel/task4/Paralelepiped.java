package com.hillel.task4;

public class Paralelepiped {
    public static void main(String[] args) {
       /* 1.Паралелепіпед:
        Створити у новому класі main-метод;
        Створити три змінні для зберігання сторін паралелепіпеда;
        Розрахувати об’єм у змінній volume;
        Вивести на екран змінну volume у вигляді:
        System.out.println("Об’єм паралелепіпеда = "+ volume);
        e. Порахувати сумарну довжину всіх сторін у змінній length та вивести її в консоль;*/
        float a,b,c,volume,length;
        a = 19.35F;
        b = 15.34F;
        c = 17.38F;
        volume =a*b*c;
        length = 4*(a+b+c);
        System.out.println("Об’єм паралелепіпеда = "+ volume);
        System.out.printf("Суммарна довжина ==%.2f",length);
        //2. Створити дві змінні з широтою і довготою вашого поточного розташування або розташування будь-якої пам'ятки у світі; Вивести в консоль;
        //Географічний центр Європы 	47° 57′ 0″ N, 24° 11′ 0″ E
        String latitude ="47° 57′ 0″ N";
        String longitude="24° 11′ 0″ E";
        System.out.println("Широта :"+latitude);
        System.out.println("Довгота:"+longitude);
    }
}
