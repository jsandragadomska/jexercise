package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(6);
        System.out.println ("Your number is: "+a);
    }
}
