package Leetcode;
import java.util.*;
public class two_sum {


        public int[] twoSum(int[] nums, int target){
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    int complement = target - nums[i];

                    if (nums[j] == complement) {

                        return new int[] { i, j };

                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
    }
}
