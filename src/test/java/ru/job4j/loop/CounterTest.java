package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void whenStart0anaFinish10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3anaFinish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1anaFinish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0anaFinish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart7anaFinish3Then0() {
        int start = 7;
        int finish = 3;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFourToSixThenTen() {
        int start = 4;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTwoToEightThenTwenty() {
        int start = 2;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFourToTwoThenMinusFour() {
        int start = -4;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -4;
        assertThat(result).isEqualTo(expected);
    }
}