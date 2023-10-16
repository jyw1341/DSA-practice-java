package org.dsa.list;

import java.util.Arrays;

public class TwoSum {

    public static boolean bruteForceSearch(int[] nums, int target) {
        int numsLength = nums.length;
        for(int i = 0 ; i < numsLength ; i++){
            for (int j = i + 1 ; j < numsLength ; j++){
                if(nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sortAndTwoPointerSearch(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        Arrays.sort(nums);
        while (leftPointer != rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];

            if(sum == target)
                return true;
            else if (sum < target)
                leftPointer += 1;
            else
                rightPointer -= 1;
        }
        return false;
    }

}
