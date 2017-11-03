package com.java.sorting;

import java.util.Scanner;

class Bigest {
    public static void main (String[] args) {
        System.out.println ("Begin method");

        Scanner input = new Scanner (System.in);

        System.out.println ("how many numbers do you want to put in the pot?");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
        }

        for (int temp : numbers){
            System.out.print (temp + "\t");
        }
        System.out.println ("End method");
        System.out.println ("Sorting Algo");
    }
}