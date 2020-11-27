package com.example.learn.mutilpulthread.synchronize;

/**
/**
 * 不使用并发手段的后果演示
 * 两个线程同时a++，最后结果会比预计的少
 * 原因：count++，它看上去只是一个操作，实际上包含了三个动作：
 *
 * 1、读取count
 *
 * 2、将count加一
 *
 * 3、将count的值写入到内存中
 */
public class DisappearRequest1 implements Runnable{
    public static int i = 0;

    @Override
    public void run() {
        for(int j=0; j<100000; j++){
            synchronized (this) {
                i++;
            }
        }

        /*for(int j=0; j<100000; j++){
                i++;
        }*/

    }

    public static void main(String[] args) throws InterruptedException {
        DisappearRequest1 disappearRequest1 = new DisappearRequest1();
        Thread thread1 = new Thread(disappearRequest1);
        Thread thread2 = new Thread(disappearRequest1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("i= " + i);
    }
}
