package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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

    @Test
    public void shouldNoSquares() {

        SQRService service = new SQRService();

        int a = 500;
        int b = 525;
        int expected = 0;

        int actual = service.squareCalc(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAllSquares() {

        SQRService service = new SQRService();

        int a = 100;
        int b = 484;
        int expected = 13;

        int actual = service.squareCalc(a, b);

        assertEquals(expected, actual);


    }
}