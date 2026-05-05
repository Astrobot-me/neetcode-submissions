class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int total = nums1.length + nums2.length; 
        int half = Math.floorDiv(total,2); 

        int A[] = nums1, B[] = nums2;

        if(nums1.length < nums2.length ) { 
            A = nums1; 
            B = nums2; 
        } else {
            A = nums2;
            B = nums1;
        }

        int n = B.length;
        
        int l = 0; 
        int h = n; 


        while (l<= h) {

            int mid = (l+h)/2; 

            int i = mid - 1; 
            int j = half - mid - 1; 
            
            int B_left = (i >= 0 ) ? B[i] : Integer.MIN_VALUE; 
            int A_left = (j >= 0 ) ? A[j] : Integer.MIN_VALUE; 
            int B_right = (i+1 < B.length ) ? B[i+1] : Integer.MAX_VALUE; 
            int A_right = (j+1 < A.length ) ? A[j+1] : Integer.MAX_VALUE; 
           

            if(A_left <= B_right && B_left <= A_right) {

                if(total % 2 == 0 ) {

                    return (Math.min(A_right,B_right ) + Math.max(A_left, B_left)) / 2.0;

                }

                return (double)Math.min(A_right, B_right); 
            } else if(B_left > A_right) {
                h = mid - 1;
            }else{ 
                l = mid + 1;

            }
        }

        return 0.0; 
         
    }
}