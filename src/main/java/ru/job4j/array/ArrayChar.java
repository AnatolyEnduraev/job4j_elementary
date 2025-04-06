package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        if (prefix.length > word.length) {
            return false;
        }
            for (int index = 0; index < prefix.length; index++) {
            if (word[index] != prefix[index]) {
                return false;
            }
        }
        return true;
    }
}