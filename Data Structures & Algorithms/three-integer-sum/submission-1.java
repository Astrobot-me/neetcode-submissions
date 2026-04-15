class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
        Arrays.sort(nums); 
        int n = nums.length; 

        for(int i = 0 ; i < n ; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int a = nums[i]; 
            int l = i+1; 
            int h = n-1;

            while( l < h) {

                int sum = a + nums[l] + nums[h]; 

                if(sum == 0) {
                    ans.add(Arrays.asList(a,nums[l], nums[h]));
                    l++; 
                    h--; 
                    while (l < h && nums[l] == nums[l - 1]) l++;
                    while (l < h && nums[h] == nums[h + 1]) h--;
                }else if(sum > 0) {
                    h--; 
                }else {
                    l++; 
                }
            } 

        }   
        return ans; 
    }
} 