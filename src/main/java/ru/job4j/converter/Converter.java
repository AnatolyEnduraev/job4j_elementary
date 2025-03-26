package ru.job4j.converter;

public class Converter {

    /**
     *  Assuming the conversion rate is 1 Euro = 90 Rubles
     * @param value
     * @return
     */
    public static double rubleToEuro(double value) {

        return value / 90;
    }

    /**
     *   Assuming the conversion rate is 1 Dollar = 75 Rubles
     * @param value
     * @return
     */
    public static double rubleToDollar(double value) {

        return value / 75;
    }
}



