package ru.saule289;

import java.util.Scanner;

public class Vycheslav {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав") )
        {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
            }
    }
}
