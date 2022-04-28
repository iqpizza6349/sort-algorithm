package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class InsertSort implements Sort {

    private final int[] elements;

    public InsertSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        int size = elements.length;
        for (int i = 1; i < size; i++) {
            int temp = elements[i];
            int prev = i - 1;
            while (prev >= 0 && elements[prev] > temp) {
                elements[prev + 1] = elements[prev];
                prev--;
            }
            elements[prev + 1] = temp;
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
