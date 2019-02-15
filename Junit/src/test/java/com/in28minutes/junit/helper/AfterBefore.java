package com.in28minutes.junit.helper;

import org.junit.*;

public class AfterBefore {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Test
    public void newTest() {
        System.out.println("New Test");
    }

    @Before
    public void beforeTest() {
        System.out.println("before");
    }

    @Test
    public void someTest() {
        System.out.println("someTest");
    }

    @After
    public void afterTest() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
