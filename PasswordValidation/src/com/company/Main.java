package com.company;
import java.util.*;


public class Main {
    public static void IsValid(String password) throws InvalidPassword{
        if(!((password.length() >=5) &&(password.length()<=10))) {
            throw new InvalidPassword(1);
        }

        if(true) {
            int flag = 0;
            for (int i = 0; i <= 9; i++) {
                String str = Integer.toString(i);

                if (password.contains(str)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                throw new InvalidPassword(2);
            }
        }

        if (!(password.contains("@") || password.contains("#") || password.contains("&")
                || password.contains("%") || password.contains("*") || password.contains("!") )){

            throw new InvalidPassword(3);

        }

        if(true) {
            int flag = 0;
            for (int i = 65; i < 90; i++) {
                char ch = (char) i;
                String str = Character.toString(ch);
                if (password.contains(str)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                throw new InvalidPassword(4);
            }
        }
        if(true) {
            int flag = 0;
            for (int i = 90; i <= 122; i++) {
                char ch = (char) i;
                String str = Character.toString(ch);
                if (password.contains(str)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                throw new InvalidPassword(5);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password= sc.nextLine();

        try {
            IsValid(password);
            System.out.println("Valid Password");
        }

        catch(InvalidPassword e){
            System.out.println("Invalid Password");
        }
    }
}
