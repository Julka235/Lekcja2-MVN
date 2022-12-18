package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParityVerificationTest {

    @Test
    void shouldVerifyIf11IsEven() {
        // given
        int number = 11;
        // when
        boolean isEven = ParityVerification.verifyIsEven(number);
        // then
        Assertions.assertEquals(false, isEven);
    }

    @Test
    void shouldVerifyIf16IsEven() {
        // given
        int number = 16;
        // when
        boolean isEven = ParityVerification.verifyIsEven(number);
        // then
        Assertions.assertEquals(true, isEven);
    }
}