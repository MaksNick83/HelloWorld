package com.hillel.task2;

public class PrimitiveType {

    public static void main(String[] args){

        //Ctrl+Alt+L - форматування
        //Ctrl+D - копиювання рядку
        //Ctrl+Y - вилучення рядку

        byte    b = 0b0111_1111;
        short   s = 32565;
        char    c = 65;
        int     i = 2_000_000_000;
        long    l = 456L;
        float   f = 45.2F;
        double  d = 4444.444D;
        boolean bb = true;
        String  str ="Hello";

        System.out.println("b="+b);
        System.out.println("s="+s);
        System.out.println("c="+c);
        System.out.println("c="+i);
        System.out.println("l="+l);
        System.out.printf("f=%.4f\n",f);
        System.out.printf("d=%.4f\n",d);
        System.out.println("bb="+bb);
        System.out.println(str+"World");


    }

}
