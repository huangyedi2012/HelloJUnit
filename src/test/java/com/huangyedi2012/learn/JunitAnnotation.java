package com.huangyedi2012.learn;

import org.junit.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author liaozexiang
 * @since 2018/6/23 10:19
 */

public class JunitAnnotation {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    @Before
    public void before() {
        System.out.println("in before");
    }

    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void test() {
        System.out.println("in test");
    }

    @Test
    public void test2(){
        System.out.println("in test2");
    }

    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }


}
