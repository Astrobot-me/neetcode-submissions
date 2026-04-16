class Solution {
    public int search(int[] nums, int target) { 

        return solve(0, nums.length - 1, target, nums);  

    }

    int solve(int low , int high ,int target, int[] nums) {

        if(low > high) return -1; 

        int mid = low + (high - low)/2; 

        if(nums[mid] == target) {
            return mid; 
        }else if(nums[mid] > target) {
            return solve(low, mid - 1, target, nums);
        }else {
            return solve(mid+1, high , target, nums);

        }

        // return -1; 
    }
}