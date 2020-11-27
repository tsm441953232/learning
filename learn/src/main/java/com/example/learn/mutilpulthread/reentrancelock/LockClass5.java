package com.example.learn.mutilpulthread.reentrancelock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock Interruptibly
 */
public class LockClass5 implements Runnable {
    private Integer key = 0;
    private Integer value = 0;

    // 锁对象
    private Lock lock = new ReentrantLock();

    @SneakyThrows
    @Override
    public void run() {
        // 需要结果是key实现自增长，如果没有同步块，则可能会出现重复key值的现象
        for (int j = 0; j < 10000; j++) {
            lock.lockInterruptibly();
            try {
                key++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockClass5 lt = new LockClass5();

        Thread thread1 = new Thread(lt);
        Thread thread2 = new Thread(lt);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
        System.out.println("key == " + lt.key + " value == " + lt.value + " all == " + (lt.key + lt.value));
    }

}
