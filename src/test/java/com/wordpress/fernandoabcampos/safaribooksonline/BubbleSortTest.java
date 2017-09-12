package com.wordpress.fernandoabcampos.safaribooksonline;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {

        final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int[] unsorted = {10, 8, 5, 4, 7, 2, 3, 1, 9, 6};

        assertArrayEquals(expected, BubbleSort.bubbleSort(unsorted));

    }

}
