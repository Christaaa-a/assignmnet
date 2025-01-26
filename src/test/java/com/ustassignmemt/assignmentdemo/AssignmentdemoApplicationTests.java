package com.example.array;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ArrayUtilsTest {

	@Mock
	private com.example.array.ArrayUtils mockArrayUtils;

	public ArrayUtilsTest() {
		MockitoAnnotations.openMocks(this); // Initialize mocks
	}

	@Test
	void testSortArray() {
		int[] input = {5, 3, 8, 1};
		int[] expected = {1, 3, 5, 8};
		assertArrayEquals(expected, com.example.array.ArrayUtils.sortArray(input));
	}

	@Test
	void testSortArrayWithNull() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> ArrayUtils.sortArray(null));
		assertEquals("Array cannot be null", exception.getMessage());
	}

	@Test
	void testAreArraysEqual_True() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		assertTrue(ArrayUtils.areArraysEqual(arr1, arr2));
	}

	@Test
	void testAreArraysEqual_False() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {3, 2, 1};
		assertFalse(ArrayUtils.areArraysEqual(arr1, arr2));
	}

	@Test
	void testAreArraysEqualWithNull() {
		int[] arr1 = null;
		int[] arr2 = {1, 2, 3};
		Exception exception = assertThrows(IllegalArgumentException.class, () -> ArrayUtils.areArraysEqual(arr1, arr2));
		assertEquals("Arrays cannot be null", exception.getMessage());
	}

	@Test
	void testSortArrayUsingMock() {
		int[] input = {9, 2, 7};
		int[] mockedSorted = {2, 7, 9};

		// Mock behavior
		when(mockArrayUtils.sortArray(input)).thenReturn(mockedSorted);

		// Assert mocked behavior
		assertArrayEquals(mockedSorted, mockArrayUtils.sortArray(input));
		verify(mockArrayUtils).sortArray(input); // Verify interaction
	}
}
