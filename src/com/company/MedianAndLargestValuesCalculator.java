package com.company;

import java.util.Arrays;

public class MedianAndLargestValuesCalculator {

    private Integer[] values;
    private int size;

    public MedianAndLargestValuesCalculator(Integer... values) {
        this.values = values;
        this.size = values.length;
        bubbleSort();
        System.out.println(Arrays.toString(values));
    }

    private void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (values[j] > values[j+1]) {
                    // swap
                    Integer temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public double computeMedian() {
        double median;
        int halfSize = size / 2;
        if (size % 2 == 0)
            median = ((double) values[halfSize] + (double) values[halfSize - 1]) / 2;
        else
            median = (double) values[halfSize];
        return median;
    }

    public int computeLargest() {
        return values[size - 1];
    }
}
