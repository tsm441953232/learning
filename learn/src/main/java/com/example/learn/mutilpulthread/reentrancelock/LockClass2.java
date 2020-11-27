package com.example.learn.mutilpulthread.reentrancelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class LockClass2 implements Runnable {
    private Integer key = 0;
    private Integer value = 0;

    // 锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 需要结果是key实现自增长，如果没有同步块，则可能会出现重复key值的现象
        for (int j = 0; j < 10000; j++) {
            boolean getLock = lock.tryLock();
            if (getLock) {
                try {
                    key++;
                } finally {
                    lock.unlock();
                }
            } else {
                value++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockClass2 lt = new LockClass2();

        Thread thread1 = new Thread(lt);
        Thread thread2 = new Thread(lt);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("key == " + lt.key + " value == " + lt.value + " all == " + (lt.key+ lt.value));
    }

}
