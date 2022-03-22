package com.company;

import java.lang.*;
import java.util.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you existing User or not");
        System.out.println("yes/no");
        System.out.println("1.Registration\n2.Login");

        int choice= sc.nextInt();
        if (choice==1){
            Registration reg = new Registration();
            String username= sc.next();
            String Password= sc.next();
            String reenter_password= sc.next();
            reg.register(username,Password, reenter_password );

        }
        else if(choice==2){
            Login log= new Login();
            String username= sc.nextLine();
            String password= sc.next();
            log.Log(username, password);
        }
        else{
            System.out.println("Enter a Valid choice:");
        }
    }
}
