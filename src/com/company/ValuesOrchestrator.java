package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValuesOrchestrator {

    private MedianAndLargestValuesCalculator calculator;

    public void acceptInputValues() {
        List<Integer> inputs = scanInputs();
        initMedianAndLargestValuesCalculator(inputs);
    }

    private void initMedianAndLargestValuesCalculator(List<Integer> inputs) {
        Integer[] arr = new Integer[inputs.size()];
        arr = inputs.toArray(arr);
        calculator = new MedianAndLargestValuesCalculator(arr);
    }

    private List<Integer> scanInputs() {
        Scanner scanner = new Scanner(System.in);

        int n = getNumValues(scanner);

        return scanInputsFromN(scanner, n);
    }

    private List<Integer> scanInputsFromN(Scanner scanner, int n) {
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(scanner.nextInt());
        }
        return inputs;
    }

    private int getNumValues(Scanner scanner) {
        System.out.print("Enter number of values: ");
        return scanner.nextInt();
    }

    public void printMedian() {

    }

    public void printLargest() {

    }

}
