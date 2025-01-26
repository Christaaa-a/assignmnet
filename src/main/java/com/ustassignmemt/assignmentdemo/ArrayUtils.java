package com.example.array;

import java.util.Arrays;

public class ArrayUtils {

    // Method to sort an array
    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    // Method to check if two arrays are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }
        return Arrays.equals(arr1, arr2);
    }
}
