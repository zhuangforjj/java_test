package com.jj.one;

/**
 * @author jj
 * @date 2019/6/26-8:07 PM
 */
public class StringBuffer {
    public static void main(String[] args) {
        //相比StringBuffer的效率更高
        StringBuilder myString=new StringBuilder();
        char ch='/';
        String aString="java";
        myString.append(ch);
        myString.append(aString);
        myString.insert(myString.length()-1,ch);
        System.out.println("myString = " + myString);
        System.out.println("myString = " + myString.charAt(1));
    }
}
