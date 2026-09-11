class Solution {
    public int maxSubArray(int[] nums) {
        int maxGlobal = nums[0];
        int maxCurrent = nums[0];
        
        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add nums[i] to the existing subarray 
            // or start a fresh subarray from nums[i]
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            
            // If the current subarray sum is the highest seen so far, update global max
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        
        return maxGlobal;
    }
}
