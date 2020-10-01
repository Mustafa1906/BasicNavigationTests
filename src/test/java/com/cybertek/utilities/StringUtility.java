package com.cybertek.utilities;

public class StringUtility {

    public static void verifyEquals(String actual,String expected){
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
    }
}
