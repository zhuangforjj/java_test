package com.jj.one;

import com.sun.codemodel.internal.JForEach;

/**
 * @author jj
 * @date 2019/6/26-10:18 PM
 */
public class ForEarchTest {
    public static void main(String[] args) {
        //java没有多维数组，只有数组的数组，也就是可以有金字塔结构的数组
        int[] a=new int[100];

        for (int i = 0; i <100 ; i++) {
            a[i]=i;
        }

        for(int emun:a){
            System.out.println("emun = " + emun);
        }
    }
}
