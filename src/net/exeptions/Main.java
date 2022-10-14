package net.exeptions;

import java.util.Scanner;

import net.exeptions.Data;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");

        String login;
        String password;
        String confirmPassword;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        login = scanner.next();
        System.out.println("Введите пароль:");
        password = scanner.next();
        System.out.println("Подтвердите пароль:");
        confirmPassword = scanner.next();

        try {
            if (Data.checkData(login, password, confirmPassword)) {
                System.out.println("Данные верны.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
