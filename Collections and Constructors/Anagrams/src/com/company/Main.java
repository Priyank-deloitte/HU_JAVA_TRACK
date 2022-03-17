package com.company;

import java.util.Collections;
import java.util.*;



public class Main {

    public static void main(String[] args) {
        char string1[] = {'l','i','s','t','e','n'};
        char string2[]= {'s','i','l','e','n','t'};

        int count1 = string1.length;
        int count2 = string2.length;

        if(count1!=count2) {
            System.out.println("1. Not an anagram");
        }
        else{
            Arrays.sort(string1);
            Arrays.sort(string2);

            boolean result= Arrays.equals(string1,string2);

            if(result==true){
                System.out.println("Both the strings are Anagram");
            }
            else{
                System.out.println("2, Not an Anagram");
            }

        }

    }
}
