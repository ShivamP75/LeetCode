package com.company;

import java.util.Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int[] leftHigh = new int[height.length];
        int[] rightHigh = new int[height.length];
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            leftHigh[i] = Math.max(height[i], maxHeight);
            maxHeight = Math.max(height[i], maxHeight);
        }

        maxHeight = Integer.MIN_VALUE;
        for (int i = height.length-1; i >= 0; i--) {
            rightHigh[i] = Math.max(height[i], maxHeight);
            maxHeight = Math.max(height[i], maxHeight);
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(leftHigh[i], rightHigh[i]) - height[i];
        }
        return sum;
    }
}
