package com.tistory.workshop6349.sort.testcase;

import java.util.Random;

/**
 * 최대값과 최소값 둘 다 존재하는 지나치게 크기가 심한 케이스
 */
public class MaxCase implements Case {

    @Override
    public void testCase() {
        data.add(-2147483647);
        data.add(2147483647);
        Random random = new Random();
        for (int i = 0; i < 32765; i++) {
            if (i % 5 == 0) {
                data.add(-1 * random.nextInt());
            }
            else {
                data.add(random.nextInt());
            }
        }
    }
}
