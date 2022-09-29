package com.company.ExecutionMeasuring;

public class TestThread {

    public static void testDrive(){
        Thread thread = new Thread(){
            public void run() {
                while (true) {

                try {

                    Thread.currentThread().setName("TestThread");

                    method1();

                    method2();
                    method3();
                    method4();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            }
        };

        thread.start();
    }

    static void method1() throws InterruptedException {
        Thread.sleep(10000);
    }


    static void method2() throws InterruptedException {
        Thread.sleep(3000);
    }
    static void method3() throws InterruptedException {
        Thread.sleep(3000);
    }
    static void method4() throws InterruptedException {
        Thread.sleep(3000);
    }
}
