package com.javaman.aop;

/**
 * @author pengzhe
 * @date 2018/4/21 14:43
 * @description
 */

public class TestBean {

    private String testStr = "testStr";

    public void test() {
        System.out.println("Test Method execute");
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
