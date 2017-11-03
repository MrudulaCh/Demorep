package com.java.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to sort");
        int val = input.nextInt();
        int[] listToSort = new int[val];
        for(int n =0;n<val;n++){
            System.out.println("Number" + n + "");
            listToSort[n] = input.nextInt();

        }
        try {
            for (int i = 0; i < val; i++) {
                for (int j = i + 1; j < val; j++) {
                    if (listToSort[i] > listToSort[j]) {
                        swap(listToSort, i, j);
                    }
                }

                System.out.println("\n Selection sorted values :");

                for (int tempSort : listToSort) {
                    System.out.print(tempSort + "\t");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void swap(int[] listToSort, int i, int j) {
        int temp = listToSort[i];
        listToSort[i] = listToSort[j];
        listToSort[j] = temp;

    }
}

