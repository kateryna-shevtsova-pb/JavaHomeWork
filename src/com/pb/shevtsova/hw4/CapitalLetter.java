package com.pb.shevtsova.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] auto = {};
        int i = 0;
        String result1="";

        System.out.println("Введите строку произвольного текста: ");
        String m = in.nextLine();

        StringTokenizer st = new StringTokenizer(m);
        while(st.hasMoreTokens()) {
            i++;
            String key = st.nextToken();
            String result = key.substring(0,1).toUpperCase() + key.substring(1).toLowerCase();
            result1 += result + " ";
        }
        System.out.println(result1);


    }
}
