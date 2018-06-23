package com.huangyedi2012.learn;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 10:25
 */

public class PrimeNumberChecker {

    public Boolean validate(final Integer primeNumber) {
        int end = primeNumber / 2;
        for (int i = 2; i < end; i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
