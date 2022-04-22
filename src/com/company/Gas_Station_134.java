package com.company;

public class Gas_Station_134 {
    public static void main(String[] args) {
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLeft =0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            gasLeft += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(gasLeft<0){
                start = i+1;
                gasLeft = 0;
            }

        }
        if(sum < 0) return -1;
        return start;
    }
}
