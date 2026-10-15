class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!List.contains(nums1[i])){
                     List.add(nums1[i]);
                }
            }
        }
        }
        int newArray[]=new int[List.size()];
        for(int i = 0; i<List.size();i++){
            newArray[i]=List.get(i);
        }
        return newArray;

       
        
    }
}