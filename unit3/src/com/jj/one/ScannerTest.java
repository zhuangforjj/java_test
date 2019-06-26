package com.jj.one;
import java.util.*;

/**
 * @author jj
 * @date 2019/6/26-8:31 PM
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("账号?");
        StringBuilder myString=new StringBuilder();
        myString.append(in.nextLine());
        System.out.println("myString = " + myString.toString());
        myString.append(in.next());//分隔符作为划分
        System.out.println("myString = " + myString.toString());
    }
}
