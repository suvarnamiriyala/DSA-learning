class Solution {
    public int climbStairs(int n) {
      int i = 1 ; 
      int j = 1 ; 
      for(int k = 2 ; k <= n ; k++){
       int c = i+j;
       i = j;
       j = c;
      }
      return j;
    }
}