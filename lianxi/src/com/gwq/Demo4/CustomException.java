package com.gwq.Demo4;

public class CustomException extends Exception {
    private String detail;

    // 构造器接受字符串参数，并将其保存在对象内部的字符串引用中
    public CustomException(String detail) {
        this.detail = detail;
    }

    // 方法打印此字符串
    public void showDetail() {
        System.out.println("Exception detail: " + this.detail);
    }

    public static void main(String[] args) {
        try {
            // 在try子句中抛出CustomException异常
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            // 在catch子句中捕获并打印异常信息
            e.showDetail();
        }
    }
}
