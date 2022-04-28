package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class BubbleSort implements Sort {

    private final int[] elements;

    public BubbleSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        int size = elements.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    swap(elements, j, j + 1);
                }
            }
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
