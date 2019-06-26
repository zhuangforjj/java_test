package com.jj.one;
import java.io.PrintWriter;
import java.util.*;
/**
 * @author jj
 * @date 2019/6/26-9:17 PM
 */
public class FileTest {
    public static void main(String[] args) {
       //PrintWriter out=new PrintWriter("/Users/jj/学习/test/file.txt","UTF-8");
         Scanner in=new Scanner("/Users/jj/学习/test/file.txt");
         StringBuilder myString=new StringBuilder(in.nextLine());
        System.out.println("myString.toString() = " + myString.toString());
    }
}
