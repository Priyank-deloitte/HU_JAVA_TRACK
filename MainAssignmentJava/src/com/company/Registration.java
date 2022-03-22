package com.company;

import java.io.*;



public class Registration {
    boolean IsLength(String Password){
        boolean length= false;
        int len = Password.length();
        if (len>=6 && len<=10){
            length=true;
        }
        else{
            length=false;
            System.out.println("Password length is Invalid");
        }
        if (length==false){
            return false;
        }
        else{
            return true;
        }
    }

    boolean IsUpper(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            char ch = Password.charAt(i);
            if (ch <= 'A' && ch >= 'Z') {
                System.out.println("Atleast one upper case is required");
                return false;

            }
        }
        return true;
    }

    boolean IsLower(String Password){
        for(int i=0; i<Password.length();i++){
            char ch =Password.charAt(i);
            if(ch<='a' && ch>='z'){
                System.out.println("Atleast one lower case is required");
                return false;
            }
        }
        return true;

    }

    boolean IsSpecialCharacter(String Password){
        boolean IsspecialCharacter=true;
        for(int i=0;i<Password.length();i++){
            char ch= Password.charAt(i);
            if(ch == '@' || ch == '#' || ch == '&' || ch== '*' || ch=='!'){
                IsspecialCharacter=true;
                break;
            }
            else{
                IsspecialCharacter=false;
            }
        }
        if (IsspecialCharacter==false){
            System.out.println("Atleast one special character is required");
            return false;
        }
        else{
            return true;
        }
    }

    boolean IsDigit(String Password){
        boolean IsDigitCheck= false;
        for (int i=0; i<Password.length();i++){
            char ch=Password.charAt(i);
            if(ch>='0' && ch<='9'){
                IsDigitCheck=true;
                break;

            }
        }
        if (IsDigitCheck==false){
            System.out.println("Atleat one numeric Character required");
            return false;
        }
        else{
            return true;
        }
    }

    boolean IsPasswordValid(String password){
        boolean length = IsLength(password);
        boolean isupper = IsUpper(password);
        boolean islower= IsLower(password);
        boolean specialcharacter= IsSpecialCharacter(password);
        boolean isdigit = IsDigit(password);
        if(length==false || isupper==false || islower==false || specialcharacter==false || isdigit==false){
            return false;

        }
        else{
            return true;
        }

    }

    boolean passvalue(String password, String chechPassword){
        boolean isvalue=false;
        int i =0;int j=0;
        if(password.length() != chechPassword.length()){
            System.out.println("Password Mismatched");
            return false;
        }
        while(i<password.length() && j< chechPassword.length()){
            if (password.charAt(i) != chechPassword.charAt(j)){
                isvalue=false;
                System.out.println("Password Mismatched");
                break;
            }
            else{
                isvalue=true;
            }
            i++;
            j++;
        }
        if(isvalue){
            return true;

        }
        else{
            return false;
        }
    }
    boolean IsUserExist(String username) throws IOException{
        String line= "";
        BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\priyankverma\\Desktop\\CompanyDatabase.csv"));
        line= br.readLine();
        while((line=br.readLine()) != null){
            String[] col=line.split(",");
            if(col[1].equals(username)){
                return true;
            }
        }
        return false;

    }

    void register(String username, String password, String checkPassword) throws IOException{
        boolean check=false;
        boolean checkPasswordValidity= passvalue(password, checkPassword);
        boolean passwordValidity = IsPasswordValid(password);
        boolean userExist= IsUserExist(username);
        if (passwordValidity == true && checkPasswordValidity == true && userExist == false) {

            FileWriter fw= new FileWriter("C:\\Users\\priyankverma\\Desktop\\CompanyDatabase.csv");
            BufferedWriter br= new BufferedWriter(fw);
            br.newLine();
            String line="";
            BufferedReader bw= new BufferedReader(new FileReader("C:\\Users\\priyankverma\\Desktop\\CompanyDatabase.csv"));
            line = bw.readLine();
            String user_id="Deloitte ";
            br.write(user_id+Integer.parseInt(line)+","+username+","+password);
            br.close();
            bw.close();
            FileWriter f = new FileWriter("C:\\Users\\priyankverma\\Desktop\\CompanyDatabase.csv");
            BufferedWriter b=new BufferedWriter(f);
            b.write(Integer.toString(Integer.parseInt(line)+1));
            b.close();
            System.out.println("Registration Successful");
        }
        else{
            System.out.println("Registration Unsuccessful");
        }
    }

}
