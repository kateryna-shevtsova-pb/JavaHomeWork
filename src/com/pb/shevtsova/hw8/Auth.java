package com.pb.shevtsova.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    String login;
    String password;



    String regexLogin = "^([A-Za-z0-9-]{5,20})$";
    Pattern pattern1 = Pattern.compile(regexLogin);

    String regexPassword = "^([A-Za-z0-9+_.]{5,20})$";
    Pattern pattern2 = Pattern.compile(regexPassword);

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Matcher matcherlogin = pattern1.matcher(login);
        //System.out.println(login + " : " + matcherlogin.matches());
        Matcher matcherpass = pattern2.matcher(password);
        //System.out.println(password + " : " + matcherpass.matches());
        if (matcherlogin.matches() == false) {
            throw new WrongLoginException("Данные неверны, проверте пару логин+пароль", login);
        } else {
            if (matcherpass.matches() == false) {
                throw new WrongPasswordException(password);
            } else {
                if (password.equals(confirmPassword) == false)
                {System.out.println("Пароли не совпадают, попробуйте заново");}
                else {System.out.println("Вы успешно зарегистрированы");};
            }
        }
    }
    public void signIn(String user_login, String user_password) throws WrongLoginException {
        if (user_login.equals(login) && user_password.equals(password)) {
            System.out.println("Вы успешно авторизованы");
        } else {
            throw new WrongLoginException("Данные неверны, проверте пару логин+пароль", login);
        }
    }
}
