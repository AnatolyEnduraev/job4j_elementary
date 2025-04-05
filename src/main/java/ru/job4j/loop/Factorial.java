package ru.job4j.loop;

public class Factorial {
        public static int calculate(int number) {
            int result = 1;
            for (int a = 2; a <= number; a++) {
                result = result * a;
            }
            return result;
        }
    }

