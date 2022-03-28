package com.company;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int h = 0;
        int i = 0;
        int j = height.length-1;

        while(i < j){
            if (height[i] <= height[j]) {
                h = height[i] * (j - i);
                if (h > max) max = h;
                break;
            }
            else j--;
            }

        return max;
    }
}
