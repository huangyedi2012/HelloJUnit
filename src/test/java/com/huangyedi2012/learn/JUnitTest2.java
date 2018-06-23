package com.huangyedi2012.learn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 10:00
 */

public class JUnitTest2 {

    String message = "Robert";

    @Test
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage()");
        String message = "Hi!" + "Robert";
        assertEquals(message, "Hi!" + this.message);
    }
}
