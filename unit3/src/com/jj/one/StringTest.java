package com.jj.one;

/**
 * @author jj
 * @date 2019/6/25-10:31 PM
 */
public class StringTest {
    public static void main(String[] args) {
        //若想获得其真正字符串的个数，应该是codePointCount()
        //若想获得真正指定位置处的字符，应该使用的是codePointAt()
        String myName="zhuangzhe吉";
        String testString="懂";
        String mySex=myName.substring(0,6);
        char num=(char)myName.codePointAt(2);
        System.out.println("num = " + num);
        System.out.println("mySex = " + mySex);
        System.out.println("myName = " + myName);
        System.out.println("num = " + myName.length());
        System.out.println("num = " + testString.length());
        System.out.println("num = " + testString.codePointCount(0,testString.length()));

        
    }
}
