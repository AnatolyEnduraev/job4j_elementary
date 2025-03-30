package ru.job4j.condition;

/**
 * Класс для работы с векторами.
 */
public class Vector {

    /**
     * Метод выполняет сложение двух векторов.
     *
     * @param x1 координата x первого вектора.
     * @param y1 координата y первого вектора.
     * @param x2 координата x второго вектора.
     * @param y2 координата y второго вектора.
     * @return строка с координатами результирующего вектора.
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}



