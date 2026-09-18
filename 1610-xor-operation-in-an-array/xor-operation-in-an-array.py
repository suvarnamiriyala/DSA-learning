class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        a = 0
        while n:
            a ^= start
            start+=2
            n-=1
        return a