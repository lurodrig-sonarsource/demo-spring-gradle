package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSortWithUnsortedArray() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortWithSingleElementArray() {
        int[] array = {42};
        int[] expected = {42};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortWithDuplicateElements() {
        int[] array = {5, 1, 4, 2, 1};
        int[] expected = {1, 1, 2, 4, 5};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
}