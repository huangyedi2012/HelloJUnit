package com.huangyedi2012.learn;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 09:44
 */

public class JavaTest extends TestCase {

    private int value1,value2;

    @Override
    protected void setUp() {
        value1 = 1;
        value2 = 2;
    }

    public void testAdd(){
        int result = value1 + value2;
        assertEquals(3,result);
    }
}
