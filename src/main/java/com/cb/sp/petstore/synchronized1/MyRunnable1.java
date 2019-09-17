package com.cb.sp.petstore.synchronized1;

import java.util.concurrent.Executor;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/16 15:40
 */
public class MyRunnable1 {

    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i < 10; i++)
            new Thread(() -> {
                try {
                    if (num > 0) {
                        System.out.println("" + Thread.currentThread().getName() + "开始" + ",num= " + num);
                        Thread.sleep(1000);
                        System.out.println("" + Thread.currentThread().getName() + "结束");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
    }
}


