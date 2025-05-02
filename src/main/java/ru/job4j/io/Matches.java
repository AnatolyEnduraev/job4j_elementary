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
            System.out.println(player + ", введите число от 1 до 3:");
            int matches;
            try {
                matches = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число.");
                continue;
            }
            if (matches < 1 || matches > 3 || matches > count) {
                System.out.println("Ошибка: введите число от 1 до 3 и не больше оставшихся спичек (" + count + ").");
                continue;
            }
            count -= matches;
            System.out.println("Осталось спичек: " + count);
            turn = !turn;
        }
        System.out.println((!turn ? "Выиграл первый игрок!" : "Выиграл второй игрок!"));
        input.close();
    }
}

