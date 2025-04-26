package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        assertEquals(2.0, result, 0.01);
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        assertEquals(2.83, result, 0.01);
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        assertEquals(5.66, result, 0.01);
    }

    @Test
    public void whenTwoPointsIn3DThenDistanceIsCorrect() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 6, 8);
        double result = point1.distance3d(point2);
        assertEquals(7.07, result, 0.01);
    }

    @Test
    public void whenSamePointsThenDistanceIsZero() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(1, 2, 3);
        double result = point1.distance3d(point2);
        assertEquals(0.00, result, 0.01);
    }
}



