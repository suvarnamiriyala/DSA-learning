class Solution:
    def findErrorNums(self, nums: list[int]) -> list[int]:
        nums.sort()
        ans = []
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                k = nums[i]
        for j in range(1 , len(nums)+1):
            if j not in nums:
                return [k , j]
        return [k , len(nums)]