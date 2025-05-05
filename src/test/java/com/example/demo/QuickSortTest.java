package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testQuickSortWithUnsortedArray() {
        int[] array = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithSingleElementArray() {
        int[] array = {42};
        int[] expected = {42};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithDuplicateElements() {
        int[] array = {5, 1, 4, 2, 1};
        int[] expected = {1, 1, 2, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }
}