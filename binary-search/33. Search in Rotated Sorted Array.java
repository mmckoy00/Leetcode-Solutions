/**
PROBLEM STATEMENT

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
 */


class Solution {
    public int search(int[] nums, int target) {
        int leftSide = 0;
        int rightSide = nums.length - 1;
        while(leftSide <= rightSide){
           int  midIndex = (leftSide + rightSide)/2;

            if(target == nums[midIndex]){
                return midIndex;
            }

            if(nums[leftSide] <= nums[midIndex]){
                if(nums[leftSide] <= target && nums[midIndex] >= target){
                    rightSide = midIndex -1;
                }else{
                    leftSide = midIndex + 1;
                }
            }else{
                if(nums[rightSide] >= target && nums[midIndex] <= target){
                    leftSide = midIndex + 1;
                }else{
                    rightSide = midIndex - 1;
                }
            }
        }
        return -1;
    }
}