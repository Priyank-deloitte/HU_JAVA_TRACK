package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] array= new int[10];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("no. 0f elements: ");
        n= sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int a=0, b=1;
        for(int i=0;i<n;i++) {
            if (array[i] > 0) {
                array[i] = 1;
            }
            else {
                array[i] = -1
                ;
            }
            if (i > 0) {
                array[i] += array[i - 1];
            }
            if (array[i] == 1) {
                b++;
            }
            else {
                a++;
            }
        }
        System.out.println(a+b);

    }
}
