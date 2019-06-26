package com.jj.one;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author jj
 * @date 2019/6/26-10:04 PM
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("How many number do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n=in.nextInt();

        BigInteger lotterOdds=BigInteger.valueOf(1);

        for (int i = 1; i <=k; i++) {
            lotterOdds=lotterOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in" + lotterOdds+".Good luck!");
    }
}
