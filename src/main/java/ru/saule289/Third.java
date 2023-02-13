package ru.saule289;

import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int[] numbers = {9, 78, 99, 33, 9, 74};
        int value = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                value = numbers[i];
            }
            System.out.println("Элементы массива кратные 3: " + value);
        }
    }
}


