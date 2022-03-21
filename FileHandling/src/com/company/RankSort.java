package com.company;

public class RankSort {
    public RankSort(String[][] column, int n, int value)
    {
        String name;
        String reg10;
        String reg12;
        String btech;
        String rank;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i - 1; j++) {
                if (Integer.parseInt(column[j][4]) > Integer.parseInt(column[j + 1][4])) {
                    name = column[j][0];
                    reg10 = column[j][1];
                    reg12 = column[j][2];
                    btech = column[j][3];
                    rank = column[j][4];


                    column[j][0] = column[j + 1][0];
                    column[j][1] = column[j + 1][1];
                    column[j][2] = column[j + 1][2];
                    column[j][3] = column[j + 1][3];
                    column[j][4] = column[j + 1][4];

                    column[j + 1][0] = name;
                    column[j + 1][1] = reg10;
                    column[j + 1][2] = reg12;
                    column[j + 1][3] = btech;
                    column[j + 1][4] = rank;


                }
            }
        }
    }

}
