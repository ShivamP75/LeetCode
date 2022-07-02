package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Units_on_a_Truck_1710 {
    public static void main(String[] args) {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7},{3, 9}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        }
        );
        System.out.println(Arrays.deepToString(boxTypes));
        int maxUnits = 0;
        for(int i = 0;i< boxTypes.length;i++){
            if(truckSize >= boxTypes[i][0]){
                truckSize -= boxTypes[i][0];
                maxUnits += (boxTypes[i][0] * boxTypes[i][1]);

                if(truckSize == 0)
                    break;
            }
            else{
                maxUnits += truckSize * boxTypes[i][1];
                break;
            }

        }
        return maxUnits;

    }
}
