package com.company;

public class Pattern {

    public static void main(String[] args){
        int range=9;
        for(int i=1;i<20;i++){
            if(i<=10){
                for(int j=0;j<range;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println("");
                range--;
            }
            else{
                for(int j=1;j<=i-10;j++){
                    System.out.print(" ");
                }
                for(int k=20-i;k>0;k--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

}

