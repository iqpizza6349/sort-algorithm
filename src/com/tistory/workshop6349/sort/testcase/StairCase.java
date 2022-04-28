package com.tistory.workshop6349.sort.testcase;

/**
 * 이미 정렬된 배열
 */
public class StairCase implements Case {

    @Override
    public void testCase() {
        for (int i = 0; i < 32768; i++) {
            data.add(i);
        }
    }
}
