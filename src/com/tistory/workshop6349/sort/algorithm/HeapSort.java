package com.tistory.workshop6349.sort.algorithm;

import com.tistory.workshop6349.sort.Sort;

public class HeapSort implements Sort {

    private final int[] elements;

    public HeapSort(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void action() {
        int size = elements.length;
        for (int i = size / 2 - 1; i > 0; i--) {
            heap(elements, size, i);
        }

        for (int i = size - 1; i > 0; i--) {
            swap(elements, 0, i);
            heap(elements, i, 0);
        }
    }

    private void heap(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // 왼쪽 자식 노드
        if (l < n && arr[p] < arr[l]) {
            p = l;
        }
        // 오른쪽 자식 노드
        if (r < n && arr[p] < arr[r]) {
            p = r;
        }

        // 부모 노드 < 자식 노드
        if (i != p) {
            swap(arr, p, i);
            heap(arr, n, p);
        }
    }

    @Override
    public int[] getResult() {
        return elements;
    }
}
