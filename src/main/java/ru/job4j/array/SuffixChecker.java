package ru.job4j.array;

public class SuffixChecker {
    public static boolean endsWith(char[] word, char[] postfix) {
        for (int index = 0; index < postfix.length; index++) {
            if (word[word.length - 1 - index] != postfix[postfix.length - 1 - index]) {
                return false;
            }
        }
        return true;
    }
}


