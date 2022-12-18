package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {

    @Test
    void shouldReturnDayOfTheWeekForNumber3() {
        // given
        int number = 3;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Wednesday".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnDayOfTheWeekForNumber6() {
        // given
        int number = 6;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("Weekend".toCharArray(), day.toCharArray());
    }

    @Test
    void shouldReturnDayOfTheWeekForNumber0() {
        // given
        int number = 0;
        // when
        String day = DayOfTheWeek.returnDayOfTheWeek(number);
        // then
        Assertions.assertArrayEquals("There is no such a day!".toCharArray(), day.toCharArray());
    }
}