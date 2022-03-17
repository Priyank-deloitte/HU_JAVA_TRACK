package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str1, str2,str3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        str1= sc.nextLine();
        System.out.println("Enter string 2 : ");
        str2= sc.nextLine();
        System.out.println("Enter string 3 : ");
        str3= sc.nextLine();
        if(str3.length() != str1.length()+str2.length()){
            System.out.println("Not a valid shuffle.");

        }
        else{
            int flag=0;
            int place;
            for(int i =0;i<str1.length();i++) {
                place = 0;
                while (flag != str3.length()) {
                    if (str1.charAt(i) == str3.charAt(flag)) {
                        str3 = str3.substring(0, flag) + '2' + str3.substring(flag + 1);
                        place = 1;
                        break;
                    }
                    if (place == 0 && flag == str3.length() - 1) {
                        System.out.println("Invalid shuffle");
                        return;
                    }
                    flag++;
                }
            }
            flag=0;
            for(int i =0; i< str2.length(); i++){
                place=0;
                while(flag!=str3.length()){
                    if (str2.charAt(i)==str3.charAt(flag)){
                        str3 = str3.substring(0, flag) + '2' + str3.substring(flag + 1);
                        flag++;
                        place = 1;
                        break;
                    }
                    if(place==0&& flag==str3.length()-1){
                        System.out.println("Invalid shuffle");
                        return;
                    }
                    flag++;
                }
            }
            System.out.println("Valid shuffle");
        }
    }
}
