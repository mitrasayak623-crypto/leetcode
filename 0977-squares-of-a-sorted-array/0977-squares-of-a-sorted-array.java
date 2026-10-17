class Solution {
    public int[] sortedSquares(int[] nums) {
        int newArray[]= new int[nums.length];
        for(int i= 0;i<nums.length;i++){
             nums[i]=nums[i]*nums[i];
             newArray[i]=nums[i];

         }
         Arrays.sort(newArray);
         return newArray;
        
         }
        
    }