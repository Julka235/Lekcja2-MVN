package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParityVerificationTest {

    // isEven function

    @Test
    void shouldReturnTrueWhenEven() {
        // given
        int number = 12;
        // when
        boolean isEven = ParityVerification.IsEven(number);
        // then
        Assertions.assertEquals(true, isEven);
    }

    @Test
    void shouldReturnFalseWhenOdd() {
        // given
        int number = 7;
        // when
        boolean isEven = ParityVerification.IsEven(number);
        // then
        Assertions.assertEquals(false, isEven);
    }

    // isOdd function

    @Test
    void shouldReturnTrueWhenOdd() {
        // given
        int number = 13;
        // when
        boolean isOdd = ParityVerification.IsOdd(number);
        // then
        Assertions.assertEquals(true, isOdd);
    }

    @Test
    void shouldReturnFalseWhenEven() {
        // given
        int number = 8;
        // when
        boolean isOdd = ParityVerification.IsOdd(number);
        // then
        Assertions.assertEquals(false, isOdd);
    }
}
