package com.cb.sp.petstore.util;

import java.util.concurrent.TimeUnit;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/11 15:54
 */
public class example1 {

    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            try {
                phone.getIOS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "AA").start();
        new Thread(() -> {
            try {
                phone.getAndroid();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "BB").start();
    }
}


class Phone {
    public synchronized void getIOS() throws Exception{
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"\t"+"i==="+i);
        }
    }

    public void getAndroid() throws Exception{
        for (int j = 0; j < 10; j++) {
            Thread.sleep(1000);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"\t"+"j==="+j);
        }
    }
}
