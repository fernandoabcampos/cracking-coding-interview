package com.wordpress.fernandoabcampos.safaribooksonline;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i <= array.length - 2; i++) {
            for (int j = 0; j <= array.length - 2 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

}
