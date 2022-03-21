package com.company;

import java.io.*;
//import java.io.PrintWriter;
import java.io.BufferedWriter;
//import java.io.File;

public class Main {

    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\priyankverma\\Desktop\\StudentData.csv");
        String line;
        String [][] column = new String[60][5];
        int i,top;
        i=0;top=5;

        try{
            BufferedReader br= new BufferedReader(new FileReader(f));
            while( (line = br.readLine()) != null && i<=59){
                column[i] = line.split(",");
                i++;
            }

        }

        catch(IOException e){
            e.printStackTrace();
        }

        new  RankSort(column,i,5);

        FileWriter fw = new FileWriter("SelectedStudents.csv");
        //BufferedWriter bw= new BufferedWriter(fw);
        PrintWriter pw= new PrintWriter(fw);
        for( int j= 0;j< top+1; j++){
            pw.println(column[j][0]+","+column[j][1]+","+column[j][2]+","+column[j][3]+","+column[j][4]);
            pw.flush();

        }
        pw.close();
    }

}
