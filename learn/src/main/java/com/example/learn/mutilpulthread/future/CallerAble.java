package com.example.learn.mutilpulthread.future;


import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.*;

@Slf4j
public class CallerAble implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int randomValue = Integer.parseInt(getNumberFromRandom(4));
        log.info("randomValue = {}, thread name = {}", randomValue ,Thread.currentThread().getName());
        Thread.sleep(30000);
        return randomValue;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*List<Future<Integer>> futureList =  new ArrayList<>();
        for(int i=0; i<10; i++){
            CallerAble callerAble =  new CallerAble();
            ExecutorService executor = Executors.newCachedThreadPool();
            Future<Integer> result = executor.submit(callerAble);
            futureList.add(result);
            log.info("提交任务 {} 结束", i);
        }

        for (Future<Integer> future: futureList) {
            log.info("over , thread name = {} ,value = {}", Thread.currentThread().getName(),future.get().intValue());
        }*/

        CallerAble callerAble =  new CallerAble();
        ExecutorService executor = Executors.newCachedThreadPool();
        log.info("before"+String.valueOf(System.currentTimeMillis()));
        Future<Integer> integerFuture = executor.submit(callerAble);
        integerFuture.get().intValue();
        log.info("after"+String.valueOf(System.currentTimeMillis()));
    }

    /**
     * 生成指定位数的随机数
     * @param n 指定的位数
     * @return
     */
    public static String getNumberFromRandom(int n){
        int temp = 0;
        int min = (int) Math.pow(10, n-1);
        int max = (int) Math.pow(10, n);
        Random rand = new Random();

        while(true){
            temp = rand.nextInt(max);
            if(temp >= min)
                break;
        }
        return String.valueOf(temp);

    }
}
