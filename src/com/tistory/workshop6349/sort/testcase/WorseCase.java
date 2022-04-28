package com.tistory.workshop6349.sort.testcase;

import java.util.List;
import java.util.Random;

/**
 * 최악의 경우를 예상한 케이스
 */
public class WorseCase implements Case {

    @Override
    public void testCase() {
        data.addAll(List.of(8, 31, 48, -11, -575, 848, 63, 914, 73, 11, 3, 20, -8124, 29, 65, -423488, 12784, 15, 1, 3284));
        data.addAll(List.of(5, 3, 8, 4, 9, 1, 6, 2, 7));
        Random random = new Random();
        for (int i = 0; i < 32747; i++) {
            data.add(10, random.nextInt());
        }
    }
}
