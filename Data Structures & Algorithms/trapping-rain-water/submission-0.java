class Solution {
    public int trap(int[] height) {
        
        int n = height.length; 
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];
        
        int max = 0; 
        for(int i = 0 ; i < n ; i++) {
            maxLeft[i] = max; 
            max = Math.max(max, height[i]); 
        }
        
        max = 0; 

        for(int i = n - 1 ; i >=0  ; i--) {
            maxRight[i] = max; 
            max = Math.max(max, height[i]); 
            
        }

        int area = 0; 
        for(int i = 0 ; i < n ; i ++) {
            int trapedWater = Math.min(maxLeft[i], maxRight[i]) - height[i]; 

            if(trapedWater > 0) area += trapedWater; 
        }; 

        return area;  
    }
}