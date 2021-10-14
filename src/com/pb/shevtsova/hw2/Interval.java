package com.pb.shevtsova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите произвольное число: ");
        int a = Integer.parseInt(in.next());


            if (a < 0 || a > 100) {
                System.out.println("Число не попадает ни в один промежуток.");
            } else if (a >= 51) {
                System.out.println("Число попадает в промежуток [51-100]");
            } else if (a >= 36) {
                System.out.println("Число попадает в промежуток [36-50]");
            } else if (a >= 15) {
                System.out.println("Число попадает в промежуток [15-35]");
            } else {System.out.println("Число попадает в промежуток [0-14]");}
    }
}
