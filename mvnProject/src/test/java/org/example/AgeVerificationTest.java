package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerificationTest {

    @Test
    void shouldVerifyIsAdultAge19() {
        // given
        int age = 19;
        // when
        boolean isAdult = AgeVerification.verifyAge(age);
        // then
        Assertions.assertEquals(true, isAdult);
    }

    @Test
    void shouldVerifyIsAdultAge16() {
        // given
        int age = 16;
        // when
        boolean isAdult = AgeVerification.verifyAge(age);
        // then
        Assertions.assertEquals(false, isAdult);
    }
}