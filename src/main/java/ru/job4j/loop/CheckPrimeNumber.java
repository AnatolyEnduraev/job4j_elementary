package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        boolean result = true;
        for (int a = 2; a <= Math.sqrt(number); a++) {
            if (number % a == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}


