package com.example.math;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    private static MathUtils mathUtils;

    @BeforeClass
    public static void setupClass() {
        System.out.println("Setting up resources for the class...");
        mathUtils = new MathUtils();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Cleaning up resources for the class...");
        mathUtils = null;
    }

    @Before
    public void setup() {
        System.out.println("Setting up before each test...");
    }

    @After
    public void cleanup() {
        System.out.println("Cleaning up after each test...");
    }

    @Test
    public void testAdd() {
        System.out.println("Testing add method...");
        int result = mathUtils.add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        System.out.println("Testing subtract method...");
        int result = mathUtils.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("Testing multiply method...");
        int result = mathUtils.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Testing divide by zero...");
        mathUtils.divide(10, 0);
    }

    @Test
    public void testDivide() {
        System.out.println("Testing divide method...");
        int result = mathUtils.divide(10, 2);
        assertEquals(5, result);
    }
}
