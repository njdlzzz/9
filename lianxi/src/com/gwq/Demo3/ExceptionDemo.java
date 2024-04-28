package com.gwq.Demo3;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // 在try块中抛出异常
            throw new Exception("这是抛出的异常信息");
        } catch (Exception e) {
            // 在catch子句中捕获并打印异常信息
            System.out.println("捕获到的异常信息是：" + e.getMessage());
        } finally {
            // 在finally子句中打印证明信息
            System.out.println("finally子句已被执行");
        }
    }
}
