package com.java.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to sort");
        int val = input.nextInt();
        int[] listToSort = new int[val];
        for(int n =0;n<val;n++){
            System.out.println("Number" + n + "");
            listToSort[n] = input.nextInt();

        }

        try{
            for(int i=0;i<val;i++){
                boolean swapped = false;
                for(int j=val-1;j>i;j--){
                    if(listToSort[j] < listToSort[j-1]){
                        swap(listToSort,j,j-1);
                        swapped = true;
                    }
                }
            System.out.println("\n After" +(i+1)+" pass:");
            System.out.println("\n Bubble sorted values :");

            for (int tempSort : listToSort) {
                System.out.print(tempSort + "\t");
            }
            if(!swapped){
                break;
            }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void swap(int[] listToSort,int i,int j){
        int temp = listToSort[i];
        listToSort[i] = listToSort[j];
        listToSort[j] = temp;
    }
}
