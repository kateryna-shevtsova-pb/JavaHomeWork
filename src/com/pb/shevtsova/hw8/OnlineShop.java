package com.pb.shevtsova.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner in = new Scanner(System.in);


        System.out.println("Введите логин: ");
        auth.login = in.nextLine();
        System.out.println("Введите пароль: ");
        auth.password = in.nextLine();
        System.out.println("Введите подтверждение пароля: ");
        String confirmpassword = in.nextLine();

        try {
        auth.signUp (auth.login, auth.password,confirmpassword);}
        catch (WrongLoginException e) {
            e.printStackTrace();
        }
        catch (WrongPasswordException e) {
            e.printStackTrace();
        }

        System.out.println("Введите логин для входа в магазин: ");
        String user_login = in.nextLine();
        System.out.println("Введите пароль для входа в магазин: ");
        String user_password = in.nextLine();

        try {
            auth.signIn (user_login, user_password);}
        catch (WrongLoginException e) {
            e.printStackTrace();
        }
            }
}
