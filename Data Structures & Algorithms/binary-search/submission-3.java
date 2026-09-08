class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1; 
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
                
            }
        
            if(nums[mid] < target){
                left = mid+1;
                right = right;
            }
            if(nums[mid] > target){
                left = left;
                right = mid-1;
            }
            System.out.println(left + " "+ mid +" "+ right);
            
        }
        return -1;
    }
}
