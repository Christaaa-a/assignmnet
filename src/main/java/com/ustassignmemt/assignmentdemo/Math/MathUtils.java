package com.example.math;

public class MathUtils {

    // Adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
