package com.hillel.lesson3;

public class BitwiseOperstion {
    public static void main(String[] args) {
        int a=0b1111_0000;
        int b=0b1010_0011;
        //&     1010_0000;
        //^
        System.out.println("a = " +a );

        System.out.println("binary a:" + Integer.toBinaryString(a));
        System.out.println("binary a:" + Integer.toBinaryString(b));
   //|or
   //&and
   //xor
        System.out.println("binary a:" + Integer.toBinaryString(a));
        System.out.println("binary a:" + Integer.toBinaryString(b));
        System.out.println("binary a&b:" + Integer.toBinaryString(a&b));
        System.out.println("binary a|b:" + Integer.toBinaryString(a|b));
        System.out.println("binary a^b" + Integer.toBinaryString(a^b));
        int t= 240>>2;
        int k= 60<<2;
        System.out.println("t=  "+t);
        System.out.println("k= " +k);
        System.out.println("t= " +Integer.toBinaryString(t));
        System.out.println("k= " +Integer.toBinaryString(k));




    }

}
