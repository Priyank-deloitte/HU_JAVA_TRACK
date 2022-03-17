package com.company;

import java.util.Collections;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> al= new ArrayList<String>();
        al.add("Hashedin");
        al.add("by");
        al.add("deloitte");
        al.add("2022");

        System.out.println("List  : "+ al);
        Collections.reverse(al);
        System.out.println("ReverseList : "+al);
    }
}
