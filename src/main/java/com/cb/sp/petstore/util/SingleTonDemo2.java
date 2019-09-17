package com.cb.sp.petstore.util;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/12 9:15
 */
public class SingleTonDemo2 {
    private static SingleTonDemo2 instance = null;

    private SingleTonDemo2(){
        System.out.println(Thread.currentThread().getName()+"\t 我是构造方法SingleTonDemo()");
    }

    private static SingleTonDemo2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingleTonDemo2.getInstance() == SingleTonDemo2.getInstance());
        System.out.println(SingleTonDemo2.getInstance() == SingleTonDemo2.getInstance());
        System.out.println(SingleTonDemo2.getInstance() == SingleTonDemo2.getInstance());
        System.out.println(SingleTonDemo2.getInstance() == SingleTonDemo2.getInstance());
    }

}

