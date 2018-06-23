package com.huangyedi2012.learn;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/22 22:59
 */

public class Calculator {

    public int evaluate(String expression) {
        int sum = 0;
        String[] nums = expression.split("\\+");
        for (String s: nums) {
            sum += Integer.valueOf(s);
        }
        return sum;
    }

}
