package Seminar_2_HW;
/*
1. Создать метод, который проверяет, является ли строка палиндромом.
Палиндром - шалаш
*/

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово полиндром - ");
        String user_text = iScanner.nextLine();
        iScanner.close();
        System.out.println(polysndrome(user_text));
    }

    private static Boolean polysndrome (String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }
}