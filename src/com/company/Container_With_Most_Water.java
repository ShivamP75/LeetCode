package com.company;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxHeight = Integer.MIN_VALUE;
        int minBuilding = Integer.MAX_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i <= j){
            int diff = height[i] - height[j];
            minBuilding = Math.min(height[i], height[j]);
            maxHeight = Math.max(maxHeight, minBuilding*(j-i));
            if(diff >= 0){
                j--;
            }
            else i++;
        }
        return maxHeight;
    }
}
