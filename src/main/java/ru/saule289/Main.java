package ru.saule289;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 7) {
            System.out.println("Привет!");
        }
        if (number < 7) {
            System.out.println("Вы ввели число меньше 7");
        } if (number == 7) {
            System.out.println("Вы ввели число 7");
        }
    }
}

