package com.wordpress.fernandoabcampos.safaribooksonline.runner;


import com.wordpress.fernandoabcampos.safaribooksonline.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 1, 5, 4, 6, 8, 9, 2, 3, 7};

        System.out.println("Results > " + printAll(BubbleSort.bubbleSort(array)));

    }

    private static String printAll(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i : array) {
            result.append(" ").append(i).append(",");
        }

        return !result.toString().equals("") ? result.toString().substring(0, result.toString().length() - 1) : "";
    }
}
