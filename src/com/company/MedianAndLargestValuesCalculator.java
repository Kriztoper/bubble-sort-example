package com.company;

import java.util.Arrays;

public class MedianAndLargestValuesCalculator {

    Integer[] values;

    public MedianAndLargestValuesCalculator(Integer... values) {
        this.values = values;
    }

    private void bubbleSort() {
        int size = values.length;
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

    public int computeMedian() {
        return 0;
    }

    public int computeLargest() {
        return 0;
    }
}
