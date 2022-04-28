package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class ShellSort implements Sort {

    private final int[] elements;

    public ShellSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        int size = elements.length;

        for (int i = size / 2; i > 0; i /= 2) {
            for (int j = i; j < size; j++) {
                int k;
                int temp = elements[j];
                for (k = j - i; k >= 0 && elements[k] > temp; k -= i) {
                    elements[k + i] = elements[k];
                }
                elements[k + i] = temp;
            }
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
