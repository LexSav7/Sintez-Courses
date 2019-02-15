package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ArrayTest {
    int[] actual = {1,4,3,2};
    int[] expected = {1,2,3,4};

    @Test
    public void testArraySorting_RandomArray() {
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySorting_NullArray() {
        int[] test = null;
        Arrays.sort(test);
//        assertArrayEquals(expected, actual);
    }

    @Test(timeout = 50)
    public void testArraySortPerfomance_SortingOneMillionTimesInOneSecond() {
        int[] test = {12, 100, 543};
        for (int i = 0; i < 1000000; i++) {
            test[1] = i;
            Arrays.sort(test);
        }
//        assertArrayEquals(expected, actual);
    }
}
