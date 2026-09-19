class Solution:
    def largestAltitude(self, gain: list[int]) -> int:
        maxAlt = 0
        c = 0
        for i in gain:
            c+=i
            maxAlt = max(maxAlt , c)
        return maxAlt
