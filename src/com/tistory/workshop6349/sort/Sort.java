package com.tistory.workshop6349.sort;

public interface Sort {

    void action();

    int[] getResult();

    default void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
