package com.pb.shevtsova.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int n=35;
        int counter = 0;

        Scanner in = new Scanner(System.in);

        while (counter < 100) {
            counter++;
            System.out.println("Введите число: ");
            int m = Integer.parseInt(in.next());

            if (m==35)
            {System.out.println("Поздравляем! Вы угадали число с " + counter +  " попытки.");
            break;}
            else
            if (m>0 && m<=100)
            { System.out.println("Мы загадали другое число. Вы желаете продолжить? y(yes)/n(no)");
                char y = in.next().charAt(0);
                switch (y) {
                    case 'y': // 'y' - условие для продолжения игры.
                        continue;
                    case 'n': // 'n' - условие для завершения игры.
                        break;
                    default: // Пользователь ввел отлично от да/нет
                    System.out.println("Вы ввели неверное значение");

                }
                break;
            }
            else {System.out.println("Число должно быть в пределах от 0 до 100"); continue;}

        }
        System.out.println("Конец игры.");
    }
}
