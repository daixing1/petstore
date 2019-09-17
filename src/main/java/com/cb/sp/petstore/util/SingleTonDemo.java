package com.cb.sp.petstore.util;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/11 17:06
 */
public class SingleTonDemo {
    private static SingleTonDemo instance = null;

    private SingleTonDemo(){
        System.out.println(Thread.currentThread().getName()+"\t 我是构造方法SingleTonDemo()");
    }

    private static SingleTonDemo getInstance(){
        if(instance == null){
            synchronized (SingleTonDemo.class) {
                if(instance == null) {
                    instance = new SingleTonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            new Thread(() -> {
                SingleTonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }

}
