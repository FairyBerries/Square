package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldSquareCalc() {

        SQRService service = new SQRService();

        int a = 500;
        int b = 1500;
        int expected = 16;

        int actual = service.squareCalc(a, b);

        assertEquals(expected, actual);
    }


}