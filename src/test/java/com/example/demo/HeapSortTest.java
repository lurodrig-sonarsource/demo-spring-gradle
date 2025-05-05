package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void testHeapSortWithUnsortedArray() {
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        HeapSort.heapSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testHeapSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.heapSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testHeapSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        HeapSort.heapSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testHeapSortWithSingleElementArray() {
        int[] array = {42};
        int[] expected = {42};
        HeapSort.heapSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testHeapSortWithDuplicateElements() {
        int[] array = {5, 1, 4, 2, 1};
        int[] expected = {1, 1, 2, 4, 5};
        HeapSort.heapSort(array);
        assertArrayEquals(expected, array);
    }
}