package com.hackathon.prgms;

public class Q60reverse {
	public static void reverseGroupsOfThree(int[] nums, int k) {
        for (int i = 0; i < nums.length; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, nums.length - 1);
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

	public static void main(String[] args) 
	{
		
		int[] nums = {3, 2, 4, 7, 0, 3, 1, 5, 8, 4};
        int k = 3;
        reverseGroupsOfThree(nums, k);

        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
	}

}
