package Leetcode;

public class third_max_number {

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] < first) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third && nums[i] < second) {
                third = nums[i];
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int)first;
        } else {
            return (int)third;
        }
    }

}
