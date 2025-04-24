package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс Point представляет точку на двумерной плоскости.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Конструктор для инициализации точки с заданными координатами.
     * @param first координата X
     * @param second координата Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод для вычисления расстояния до другой точки.
     * @param that другая точка
     * @return расстояние между текущей точкой и заданной точкой
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println("Расстояние между точками: " + distance);
    }
}
