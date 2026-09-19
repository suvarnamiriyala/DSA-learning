class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        nums.sort()
        c = 0
        ans = []
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                ans.append(nums[i])
        return ans