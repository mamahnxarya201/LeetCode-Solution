class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] size = new int[nums.length]; 
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (nums[i] > nums[j]) {
                    size[i] += 1;
                }  
            }
        }
        return size;
    }
}