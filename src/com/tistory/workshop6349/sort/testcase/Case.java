package com.tistory.workshop6349.sort.testcase;

import java.util.LinkedList;
import java.util.List;

public interface Case {

    List<Integer> data = new LinkedList<>();

    void testCase();
    
    default int[] getData() {
        return data.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
