class Solution:
    def isHappy(self, n: int) -> bool:
        num = n
        while num > 9:
            t = num
            s = 0
            while t > 0:
                d = t%10
                s+=d*d
                t//=10
            num = s
        if num == 1 or num == 7:
            return True
        else:
            return False