package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class MergeSort implements Sort {

    private final int[] elements;
    private final int[] temp;

    public MergeSort(int[] elements) {
        this.elements = elements;
        this.temp = new int[elements.length];
    }

    @Override
    public void action() {
        merge(0, elements.length - 1);
    }

    private void merge(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge(start, mid);
            merge(mid + 1, end);
            
            int p = start;
            int q = mid + 1;
            int index = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && elements[p] <= elements[q])) {
                    temp[index++] = elements[p++];
                }
                else {
                    temp[index++] = elements[q++];
                }
            }
            if (end + 1 - start >= 0) {
                System.arraycopy(temp, start, elements, start, end + 1 - start);
            }
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
