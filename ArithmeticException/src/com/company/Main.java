package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        //try block
        try{
            Scanner sc= new Scanner(System.in);
            int number1, number2, result;
            System.out.println("Try : ");
            System.out.println("Enter first number : ");
            number1= sc.nextInt();
            System.out.println("Enter secod number : ");
            number2=sc.nextInt();
            System.out.println("Dividing first number by the second number");
            result= number1/number2;
        }
        //catch block
        catch(ArithmeticException e){
            System.out.println("Catch : ");
            System.out.println("Arithmetic Exception: Number is divided by 0");
        }
        //finally block
        finally{
            System.out.println("thank you");
        }
        System.out.println("Rest of the code continues...");

    }
}
