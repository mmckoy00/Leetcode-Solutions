
/**
PROBLEM STATEMENT
Given an integer array nums, return the length of the longest strictly increasing 
subsequence
.
 */
class Solution {
public int lengthOfLIS(int[] nums) {
    int[] tails = new int[nums.length];
    int size = 0;
    for (int element : nums) {
        int startIndex = 0, endIndex = size;
        while (startIndex != endIndex) {
            int midIndex = (i + j) / 2;
            if (tails[midIndex] < element)
                startIndex = midIndex + 1;
            else
                endIndex = midIndex;
        }
        tails[startIndex] = element;
        if (startIndex == size) ++size;
    }
    return size;
}
}
