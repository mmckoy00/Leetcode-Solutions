/**
PROBLEM STATEMENT

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.

If target exists, then return its index.

 Otherwise, return -1.
 */

class Solution {
    public int search(int[] nums, int target) {

        int leftSide = 0;
        int rightSide = nums.length - 1;
        while(leftSide <= rightSide){
            int midIndex = leftSide + (rightSide - leftSide) / 2;

            if(nums[midIndex] < target){
                leftSide = midIndex + 1;
            }else if(nums[midIndex] > target){
                rightSide = midIndex - 1;
            }else{
                return midIndex;
            }
        }

        return -1;
    }
}
