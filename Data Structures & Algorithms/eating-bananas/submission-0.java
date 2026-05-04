class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1; 
        int high = 0; 
        for(int i: piles) high = Math.max(high, i); 

        int ans = -1; 
        while(low <= high) {

            int mid = (low+high)/2; 

            if(canEat(piles,mid, h)) {
                ans = mid; 
                high= mid-1; 
            }else {
                low=mid+1; 
            }

        }

        return ans; 

    }

    boolean canEat(int[] piles , int rate, int h) {

        int totalHours = 0; 
        for(int i = 0 ; i < piles.length ; i++) {

            totalHours += (int)Math.ceil((double)piles[i]/rate);
        }

        if(totalHours > h) return false;
        return true; 


    }
}
