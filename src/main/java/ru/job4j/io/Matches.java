package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;

        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            turn = !turn;
            System.out.println(player + ", введите число от 1 до 3:");
            int matches = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    matches = Integer.parseInt(input.nextLine());
                    if (matches >= 1 && matches <= 3 && matches <= count) {
                        validInput = true;
                    } else {
                        System.out.println("Ошибка: введите число от 1 до 3 и не больше оставшихся спичек (" + count + ").");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите корректное число.");
                }
            }
            count -= matches;
            System.out.println("Осталось спичек: " + count);
            if (count == 0) {
                break;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок!");
        } else {
            System.out.println("Выиграл второй игрок!");
        }
    }
}
