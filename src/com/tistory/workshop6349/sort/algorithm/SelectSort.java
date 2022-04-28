package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class SelectSort implements Sort {

    private final int[] elements;

    public SelectSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        int size = elements.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (elements[j] < elements[min]) {
                    min = j;
                }
            }

            swap(elements, min, i);
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
