class Solution:
    def maximumCount(self, nums: list[int]) -> int:
        p = 0
        n = 0
        for i in range(len(nums)):
            if nums[i] > 0:
                p+=1
            elif nums[i] < 0:
                n+=1
        if p > n :
            return p
        else:
            return n