package com.company;

public class Jump_Game_55 {
    static boolean flag = false;
    public static void main(String[] args) {
        int[] nums = {0,2,3};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int lastGoodIndex = nums.length-1;

        for (int i = nums.length-1; i >=0 ; i--) {
            if(i + nums[i] >= lastGoodIndex)
                lastGoodIndex = i;
        }
        return lastGoodIndex == 0;

    }
}

//        boolean[][] dp = new boolean[nums.length+1][nums.length+1];
//
//        for(int i = 0;i<dp.length;i++){
//            for (int j = 0; j < dp[0].length; j++) {
//                if(i == 0 && j == 0){
//                    dp[i][j] = true;
//                }
//                else if(i == 0){
//                    dp[i][j] = false;
//                }
//                else if(j == 0){
//                    dp[i][j] = true;
//                }
//                else{
//                    int rem = nums[i-1] - j;
//                    if(rem >= 0 ) dp[i][j] = dp[i-1][rem];
//                }
//            }
//            if(dp[i][dp.length-1]) return true;
//        }
//        return false;
//    }
//}
