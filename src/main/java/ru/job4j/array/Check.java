package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean firstValue = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != firstValue) {
                return false;
            }
        }
        return true;
    }
}