package com.pb.shevtsova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        Scanner in = new Scanner(System.in);


    System.out.println("Введите число1: ");
    operand1 = Integer.parseInt(in.next());
    System.out.println("Введите число2: ");
    operand2 = Integer.parseInt(in.next());
    System.out.println("Введите знак операции '+', '-', '*' или '/': ");
    String sign = in.next();


    switch (sign) {
        case "+":
            System.out.println("Результат: " +(operand1+operand2));
            break;
        case "-":
            System.out.println("Результат: " +(operand1-operand2));
            break;
        case "*":
            System.out.println("Результат: " +(operand1*operand2));
            break;
        case "/":
        if (operand2 == 0)
        {System.out.println("Ошибка! Деление на 0(ноль) недопустимо");}
        else
            {System.out.println("Результат: " +((float)operand1/operand2));}
            break;
        default:
            System.out.println("Ошибка! Неверный знак операции");
    }
    }
}
