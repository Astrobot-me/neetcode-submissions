class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int l = 0;
        int h =  matrix.length - 1;
        int m = matrix[0].length - 1; 
        int poss = -1; 

        while(l<= h) {
            int mid = l + (h-l)/2; 

            if(matrix[mid][0] <= target && matrix[mid][m] >= target) {
                poss = mid; 
                break; 
            }
            else if(matrix[mid][0] < target) {
                l = mid+1; 
            }else {
                h = mid-1; 

            }
           
        } 

        if(poss == -1) return false; 
        return bsSearch(matrix[poss], target); 
    }

    boolean bsSearch(int[] arr, int target) {
        int l = 0; 
        int h = arr.length - 1; 


        while( l <= h) {

            int mid = (l+h)/2; 

            if(arr[mid] == target) {
                return true; 
            } else if(arr[mid] >= target) {
                h = mid-1; 
            }else { 
                l = mid+1; 
            }
        }

        return false; 
    }
}
