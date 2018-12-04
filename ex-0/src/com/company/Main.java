package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter first number ");
        int f = in.nextInt();
        System.out.println ("Enter second number ");
        int s = in.nextInt();
        int r = f + s;
        System.out.println ("the sum is: " + r);
    }
}
