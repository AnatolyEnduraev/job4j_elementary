package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс Point представляет точку на двумерной плоскости.
 */
public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор для инициализации точки с заданными координатами.
     * @param first координата X
     * @param second координата Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод для вычисления расстояния до другой точки.
     * @param that другая точка
     * @return расстояние между текущей точкой и заданной точкой
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }
}
