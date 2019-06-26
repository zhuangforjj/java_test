package com.jj.one;

import java.util.Scanner;

/**
 * @author jj
 * @date 2019/6/26-9:40 PM
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("How many number do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n=in.nextInt();

        int lotteryOdds=1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds=lotteryOdds*(n-i+1)/i;
        }

        System.out.println("your odds are 1 in " + lotteryOdds+" .Good luck!");
    }
}
