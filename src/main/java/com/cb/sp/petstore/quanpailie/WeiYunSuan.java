package com.cb.sp.petstore.quanpailie;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/17 15:21
 */
public class WeiYunSuan {

    public static void main(String[] args) {
        System.out.println("20的二进制为 0001 0100");
        System.out.println("-20的二进制为 1110 1011");
        System.out.println("20 >> 2 =====" + String.valueOf(20 >> 2));
        System.out.println("20 >>> 2 =====" + String.valueOf(20 >>> 2));
        System.out.println("-20 >> 2 =====" + String.valueOf(-20 >> 2));
        System.out.println("-20 >>> 2 =====" + String.valueOf(-20 >>> 2));
        System.out.println(-10 >>> 2);
        System.out.println("20 << 2 =====" + String.valueOf(20 << 2));
        System.out.println("-20 << 2 =====" + String.valueOf(-20 << 2));
        System.out.println(Integer.toBinaryString(-20));
    }
}
