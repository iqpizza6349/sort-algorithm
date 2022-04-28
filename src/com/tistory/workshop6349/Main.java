package com.tistory.workshop6349;

import com.tistory.workshop6349.sort.Sort;
import com.tistory.workshop6349.sort.algorithm.*;
import com.tistory.workshop6349.sort.testcase.Case;
import com.tistory.workshop6349.sort.testcase.WorseCase;
import com.tistory.workshop6349.sort.timer.StopWatch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Case testCase = new WorseCase();
        testCase.testCase();
        int[] data = testCase.getData();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Sort sort = new MergeSort(data);
        sort.action();
        System.out.println(Arrays.toString(sort.getResult()));
        stopWatch.stop();
        System.out.printf("소요된 시간: %d sec / %d ms", stopWatch.getElapsedSeconds(), stopWatch.getElapsedMilliseconds());
    }
}
