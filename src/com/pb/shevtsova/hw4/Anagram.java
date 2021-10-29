package com.pb.shevtsova.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1-ю строку текста: ");
        String m1 = in.nextLine();
        m1 = (m1.toLowerCase()).trim();
        m1 = (m1.replace(",",""));
        m1 = (m1.replace(" ",""));

        System.out.println("Введите 2-ю строку текста: ");
        String m2 = in.nextLine();
        m2 = (m2.toLowerCase()).trim();
        m2 = m2.replace(",", "");
        m2 = m2.replace(" ", "");

        if (m1.length() != m2.length())
        {
            System.out.print("Это не анаграмма.");
        }
        else {
            char[] arr1 = m1.toCharArray();
            char[] arr2 = m2.toCharArray();

            for (int i=0; i<arr1.length; i++) {
                boolean anagram;
                for (int j = 0; j < arr2.length; j++)
                    if (arr1[i] == arr2[j]) {
                        anagram = true;
                    } else {
                        anagram = false;
                        break;
                    }
            }

            System.out.print("Это анаграмма.");
        }

    }
}
