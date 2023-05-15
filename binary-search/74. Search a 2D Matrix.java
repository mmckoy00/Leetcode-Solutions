
/**
PROBLEM STATEMENT
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */


class Solution {
    //find row where target is most likely to be.
    //a. check the first and last element in each row
    //if target > first element and target <  last element then search row
    //search row using binary search

    public boolean searchMatrix(int[][] matrix, int target){ 
       int row = findRow(matrix, target);
       int column = matrix[row].length - 1;
       boolean result = binarySearch(matrix, target, row, column);
       return result;
    }



//find row where target is most likely to be
    private int findRow(int[][] matrix, int target){
        int targetedRow = 0;
        for(int row = 0; row < matrix.length; row++){
           
            int column = matrix[row].length - 1;
            int firstElement = matrix[row][0];
            int lastElement = matrix[row][column];

            if(firstElement <= target){
               if(target <= lastElement){
                   targetedRow = row;
                  break;
               }
            }
        }
        return targetedRow;
    }


    //search row 
    private boolean binarySearch(int[][] matrix, int target, int row, int column){
       
       int leftIndex = 0; 
       int rightIndex = column;

       while(leftIndex <= rightIndex){
           int midIndex = leftIndex + (rightIndex - leftIndex)/2;
           
           if(matrix[row][midIndex] == target){
               return true;
           }

           if(matrix[row][midIndex] > target ){
               rightIndex = midIndex - 1;
           }else{
               leftIndex = midIndex + 1;
           }
       }

    return false;
    }

}
        

