package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerServiceImplTest {

    @Test
    void getNaturalNumsLowerThan() {
    }

    @Test
    void getPrimeNumsUnder() {
    }

    @Test
    void isPrime() {
    }

    @Test
    void convertToArrayListFrom() {
    }

    @Test
    void convertIntsFrom() {
    }

    @Test
    void getSievedNumsFor() {
    }

    @Test
    void getCoprimeNumsLowerThan() {
    }

    @Test
    void getEulerPhiFunctionValOf() {
    }

    @Test
    void getPrimeFactorsOf() {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        int[] expected = {2, 5, 11};
        int[] actual = impl.convertIntsFrom(impl.getPrimeFactorsOf(110));
        assertArrayEquals(expected, actual);
    }

    @Test
    void getStringForMathJaxAboutCayleyTableFrom() {
    }
}