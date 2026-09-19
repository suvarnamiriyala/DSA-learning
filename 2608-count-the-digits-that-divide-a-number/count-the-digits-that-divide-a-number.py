class Solution:
    def countDigits(self, num: int) -> int:
        n = num
        c = 0
        while n > 0:
            d = n%10
            if num%d == 0 and d != 0:
                c+=1
            n//=10
        return c