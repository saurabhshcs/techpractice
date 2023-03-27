package com.techsharezone.techpractice.operators;

public class JavaOperators
{
    public static void main(String[] args)
    {
        byte a = 64, b;
        int i = 0;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("The original value of a : " + a);
        System.out.println("The binary representation value of a : " + Integer.toBinaryString(a));
        System.out.println("The value of i and b : " + i + " " + b);
        System.out.println("The binary representation of value of i and b : " + Integer.toBinaryString(i) + " " + Integer.toBinaryString(b));
    }
}
