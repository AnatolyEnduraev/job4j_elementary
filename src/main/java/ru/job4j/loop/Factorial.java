package ru.job4j.loop;

public class Factorial {
        public static int calculate(int number) {
            int result = 1;
            for (int a = 1; a <= number; a++) {
                result = result * a;
            } if (number == 0) {
                return 1;
            }
            return result;
        }
    }
