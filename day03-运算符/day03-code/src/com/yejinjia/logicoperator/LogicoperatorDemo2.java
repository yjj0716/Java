package com.yejinjia.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^ 亦或
        //相同为false，不同为true
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false

        //! 逻辑非 取反
        //提示：
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}
