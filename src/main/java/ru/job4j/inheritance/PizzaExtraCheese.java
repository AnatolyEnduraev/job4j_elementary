package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String PIZZA_NAME = "extra cheese";

    @Override
    public String name() {
        return  super.name() + " " + "+" + " " + PIZZA_NAME;
    }
}