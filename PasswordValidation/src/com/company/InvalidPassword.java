package com.company;

public class InvalidPassword extends Exception{
    int passViolated=0;
    public InvalidPassword(int Violated){
        passViolated=Violated;
    }
}

