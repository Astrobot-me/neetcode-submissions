class Solution {
    public int singleNumber(int[] nums) {
        // int possible = -1; 
        int xor = nums[0]; 

        for(int i = 1; i < nums.length ;  i++) {
            xor = xor ^ nums[i]; 

           
        }

        return xor; 
    }
}
