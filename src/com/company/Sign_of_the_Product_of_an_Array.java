package com.company;

import java.math.BigDecimal;

public class Sign_of_the_Product_of_an_Array {
    public static void main(String[] args) {
        int nums = 2147483647;
        System.out.println(isPowerOfTwo(nums));
    }
    public static boolean isPowerOfTwo(int n) {
        int i = 0;
        if(n == 2147483647) return false;
        int powVal = 1 ;
        while(powVal <= n){
            if(powVal == n) return true;
            powVal = (int)Math.pow(2, ++i);
        }
        return false;
    }
}
