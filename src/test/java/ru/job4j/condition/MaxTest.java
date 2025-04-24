package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMaxOfThreeNumbers() {
        Max maxFinder = new Max();
        int result = maxFinder.max(5, 10, 20);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxOfFourNumbers() {
        Max maxFinder = new Max();
        int result = maxFinder.max(10, 20, 30, 40);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAllNumbersAreEqual() {
        Max maxFinder = new Max();
        int result = maxFinder.max(5, 5, 5);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
