package com.pb.shevtsova.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1-ю строку текста: ");
        String m1 = in.nextLine();
        m1 = (m1.toLowerCase()).trim();
        m1 = (m1.replace(",", ""));
        m1 = (m1.replace(" ", ""));

        System.out.println("Введите 2-ю строку текста: ");
        String m2 = in.nextLine();
        m2 = (m2.toLowerCase()).trim();
        m2 = m2.replace(",", "");
        m2 = m2.replace(" ", "");

        if (m1.length() != m2.length()) {System.out.print("Это не анаграмма.");}
        else {
            String m3 = (String) Sortt(m1);
            String m4 = (String) Sortt(m2);
            if (m3.equals(m4))
            {System.out.print("Это анаграмма.");}
            else {System.out.print("Это совсем не анаграмма.");}
        }

    }

    private static Object Sortt(String m) {
        char[] arr = m.toCharArray();
        Arrays.sort(arr);
        m = new String(arr);
        System.out.println(m);
        return m;
    }

}


