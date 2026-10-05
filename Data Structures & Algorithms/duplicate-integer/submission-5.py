class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        n = len(nums) - 1
        for i in range(0, n):
            if nums[i] == nums[i+1]:
                return True

        return False