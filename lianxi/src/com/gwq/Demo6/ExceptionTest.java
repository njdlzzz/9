package com.gwq.Demo6;

// 自定义三种新的异常
class CustomException1 extends Exception {}
class CustomException2 extends Exception {}
class CustomException3 extends Exception {}

public class ExceptionTest {
    public void throwExceptions(int exceptionType) throws CustomException1, CustomException2, CustomException3 {
        switch (exceptionType) {
            case 1:
                throw new CustomException1();
            case 2:
                throw new CustomException2();
            case 3:
                throw new CustomException3();
            default:
                break;
        }
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        // 用一个catch子句捕获这三种异常
        try {
            test.throwExceptions(1);
            test.throwExceptions(2);
            test.throwExceptions(3);
        } catch (CustomException1 | CustomException2 | CustomException3 e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }
    }
}
