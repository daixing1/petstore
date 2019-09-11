package com.cb.sp.petstore.util;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/11 15:56
 */
public class getAndPlus {

    public static void main(String[] args) {
        Integer i = 0;
        Integer j = i++ + i++ + ++i;
        System.out.println("j--->"+j);
    }

}
