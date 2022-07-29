package com.bootcampexcercise.module10;

import junit.framework.TestCase;

public class CalculatorTes extends TestCase {

    private Calculator numbers;

    protected void setUp() throws Exception {
        super.setUp();
        numbers = new Calculator();
    }

    protected void tearDown() throws Exception {
        numbers = null;
        super.tearDown();
    }

    public void testGetSum() {
        int a = 5;
        int b = 94;
        assertEquals(99, numbers.getSum(a, b));
        assertEquals(99, numbers.getSum(b, a));

        a = -5;
        b = 54;
        assertEquals(49, numbers.getSum(a, b));
        assertEquals(49, numbers.getSum(b, a));

        a = -10;
        b = -25;
        assertEquals(-35, numbers.getSum(a, b));
        assertEquals(-35, numbers.getSum(b, a));

        a = 10;
        assertEquals(20, numbers.getSum(a));

        b = -5;
        assertEquals(-10, numbers.getSum(b));
    }

    public void testGetResidual() {
        int a = 54;
        int b = 20;
        assertEquals(34, numbers.getResidual(a, b));
        assertEquals(-34, numbers.getResidual(b, a));

        a = -30;
        b = -5;
        assertEquals(-25, numbers.getResidual(a, b));
        assertEquals(25, numbers.getResidual(b, a));

        a = 10;
        b = -5;
        assertEquals(15, numbers.getResidual(a, b));
        assertEquals(-15, numbers.getResidual(b, a));

    }

    public void testGetProduct() throws CustomExceptions {

        int a = 6;
        int b = 2;
        assertEquals(12, numbers.getProduct(a, b));
        assertEquals(12, numbers.getProduct(b, a));

        a = 5;
        b = 0;
        //assertEquals("The result of multiplying by zero is always zero", numbers.getProduct(a, b));
        //assertEquals("The result of multiplying by zero is always zero", numbers.getProduct(b, a));

        a = -10;
        b = -50;
        assertEquals(500, numbers.getProduct(a, b));
        assertEquals(500, numbers.getProduct(b, a));

        a = -6;
        b = 10;
        assertEquals(-60, numbers.getProduct(a, b));
        assertEquals(-60, numbers.getProduct(b, a));
    }

    public void testGetQuotient() {
        int a = 20;
        int b = 2;
        assertEquals("10.0", numbers.getQuotient(a, b));
        assertEquals("0.0", numbers.getQuotient(b, a));

        a = 0;
        b = 10;
        assertEquals("0.0", numbers.getQuotient(a, b));
        assertEquals("Division by zero is not allowed", numbers.getQuotient(b, a));

    }
}
