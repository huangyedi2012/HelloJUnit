package com.huangyedi2012.learn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 09:21
 */

public class CalculatorTest {

    @Test
    public void evaluatesExpression(){
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6,sum);
    }

}
