class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        ans = []
        for num in range(left , right+1):
            n = num
            valid = True
            while n > 0:
                d = n%10
                if d == 0 or num%d != 0:
                    valid = False
                    break
                n//=10
            if valid:
                ans.append(num)
        return ans

