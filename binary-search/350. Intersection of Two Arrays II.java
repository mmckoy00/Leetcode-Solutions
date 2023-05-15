/**
PROBLEM STATEMENT
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length ==0 || nums2.length==0){
            return null;
        }
        
        
        Map<Integer, Integer> n = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        
        for(int i : nums1){
            if(n.containsKey(i)){
                n.put(i, n.get(i)+1);
            }else{
                n.put(i,1);
            }
        }
        
        for(int j : nums2){
            if(n.containsKey(j) && n.get(j) > 0){
                list.add(j);
                int count = n.get(j);
                count--;
                n.put(j, count);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }
        
        
        return result;
      
    }
}
