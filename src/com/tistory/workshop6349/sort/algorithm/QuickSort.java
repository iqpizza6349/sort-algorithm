package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class QuickSort implements Sort {

    private final int[] elements;

    public QuickSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        quickSort(elements, 0, elements.length - 1);
    }

    private void quickSort(int[] elements, int start, int end) {
        int part = partition(elements, start, end);
        if (start < part - 1) {
            quickSort(elements, start, part - 1);
        }
        if (end > part) {
            quickSort(elements, part, end);
        }
    }

    private int partition(int[] elements, int start, int end) {
        int pivot = elements[(start + end) / 2];
        while (start <= end) {
            while (elements[start] < pivot) {
                start++;
            }
            while (elements[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(elements, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
