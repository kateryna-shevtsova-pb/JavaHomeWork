package com.pb.shevtsova.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int b = 0;
        int a = 0;
        Scanner in = new Scanner(System.in);


        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите" + i + "-ое значение массива");
            array[i] = Integer.parseInt(in.next());
        }
        // Вывод на экран значений элементов массива.
        System.out.println("Вы задали массив: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // Подсчет всех элементов массива.

        for (int i = 0; i < array.length; i++) {
            a = array[i];
            b = (a + b);
        }
        System.out.println("Сумма всех элементов массива: " + b);

        a = 0;
        b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                a = array[i];
                b = (a + b);
            }
        }
        System.out.println("Сумма всех положительных элементов массива: " + b);


        // Сортировка пузырьком
        //т.к. каждый раз самы большой элемент переносится вконец строки,
        // выполняем перебор с конца строки каждый раз передвигаясь на элемент ближе к началу

        for (int i=array.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        // Вывод на экран значений элементов массива.
        System.out.println("Массив после сортировки: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        }
        }