package com.company;

public class Furthest_Building_You_Can_Reach_1642 {

    public static void main(String[] args) {
        int[] heights = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladders = 1;
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i = 0;
        while(i < heights.length-1){
            if(bricks == 0 && ladders == 0)
                break;
            if(heights[i+1] < heights[i]) {
            }
            else{
                if(bricks != 0 && bricks >= heights[i+1]-heights[i]){
                    bricks -= heights[i+1] - heights[i];
                }
                else{
                    ladders -= 1;
                }
            }
            i++;
        }
        return i;
    }
}
