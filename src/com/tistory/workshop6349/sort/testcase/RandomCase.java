package com.tistory.workshop6349.sort.testcase;

import java.util.Random;

/**
 * 모든 원소들이 -정수 최대값 ~ 정수 최대값의 범위를 가진 무작위 수를 가진 케이스<br>
 * 가장 불확실한 원소들을 가짐
 */
public class RandomCase implements Case {

    @Override
    public void testCase() {
        testCase(32767);
    }

    public void testCase(int number) {
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            data.add(random.nextInt());
        }
    }
}
