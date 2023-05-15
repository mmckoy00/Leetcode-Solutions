
/**
PROBLEM STATEMENT
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
 */
class Solution {
    public int findMin(int[] nums) {
        
        int right = searchRight(nums);
        int left = searchLeft(nums);

        return Math.min(right, left);
    }

    private int searchLeft(int[] nums){

    int startElement = 0;
    int endElement = nums.length -1;
    int midElement = (startElement + endElement)/2;

     int min = nums[midElement];

    for(int i = 0; i <= midElement; i++){
       
        if(min > nums[i]){
            min = nums[i];
        }
    }
    return min;


    }

    private int searchRight(int[] nums){
       int startElement = 0;
        int endElement = nums.length - 1;
        int midElement = (startElement + endElement)/2;

        int min = nums[midElement];

        for(int i = midElement+1; i <= endElement; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
        }
}