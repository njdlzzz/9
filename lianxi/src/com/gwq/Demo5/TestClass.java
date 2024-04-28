package com.gwq.Demo5;

public class TestClass {
    // 定义一个方法
    public void go() {
        System.out.println("Executing go method.");
    }

    public static void main(String[] args) {
        try {
            // 定义一个为null的对象
            TestClass test = null;
            // 尝试调用该对象的go方法
            test.go();
        } catch (NullPointerException e) {
            // 捕获空指针异常
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
