
/**
PROBLEM STATEMENT
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
 */

class Solution 
{
    public int findDuplicate(int[] nums) 
    {
       int storage = 0;
       Set<Integer> container = new HashSet<Integer>();
       for(int i = 0; i<nums.length; i++)
       {
            if (container.contains(nums[i]))
            {
                storage = nums[i];
               break;
            }
            else 
            {
                container.add(nums[i]);
            }
       }
       
        
        return storage;
       
    }
}