package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int length = array.length;
        for (int index = 0; index < length / 2; index++) {
            int temp = array[index];
            array[index] = array[length - 1 - index];
            array[length - 1 - index] = temp;
        }
        return array;
    }
}




