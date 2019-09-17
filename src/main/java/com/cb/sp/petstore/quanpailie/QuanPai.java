package com.cb.sp.petstore.quanpailie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 杨涛
 * @description TODO
 * @date 2019/9/17 14:54
 */
public class QuanPai {

    static List<String> result = new ArrayList<>();

    public static void sq(char data[], int k) {
        if (k == data.length) {
            String n = String.valueOf(data);
            result.add(n);
        }

        for (int i = k; i < data.length; i++) {
            {
                char temp = data[k];
                data[k] = data[i];
                data[i] = temp;
            }
            System.out.println("i---->"+i+"    k---->"+k+"    data---->"+String.valueOf(data));
            sq(data, k + 1);
            {
                char temp = data[k];
                data[k] = data[i];
                data[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String yy ;
        Scanner qq = new Scanner(System.in);
        yy = qq.next();
        char data[] = yy.toCharArray();
        sq(data, 0);
        System.out.println(result);
        System.out.println(result.size());
    }

}
