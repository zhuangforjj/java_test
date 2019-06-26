package com.jj.one;

import javax.swing.text.html.FormView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jj
 * @date 2019/6/26-10:41 PM
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("How many number do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n=in.nextInt();

        int[] number=new int[n];
        for (int i = 0; i <number.length; i++) {
            number[i]=i+1;
        }

        int[] result=new int[k];
        //思路：为了使每次的值都不一样，将选中的值等于数组最后的值，并让数组的长度减1
        for (int i = 0; i <result.length; i++) {
            int r=(int)(Math.random()*n);
            result[i]=number[r];
            number[r]=number[n-1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("my choose:");
        for(int r:result){
            System.out.println("r = " + r);
        }
    }
}
