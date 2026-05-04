class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            // 🔹 Standard BS check
            if (nums[mid] == target) return mid;

            // 🔹 Decide which half is sorted
            if (nums[l] <= nums[mid]) {
                // LEFT HALF is sorted

                // 🔹 Apply BS logic on left half
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;   // search LEFT
                } else {
                    l = mid + 1;   // search RIGHT
                }

            } else {
                // RIGHT HALF is sorted

                // 🔹 Apply BS logic on right half
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;   // search RIGHT
                } else {
                    h = mid - 1;   // search LEFT
                }
            }
        }

        return -1;
    }
}