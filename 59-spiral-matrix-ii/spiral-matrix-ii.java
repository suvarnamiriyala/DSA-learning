class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        int num = 1;
        while(t <= b && l <= r){
            for(int i = l ; i <= r ; i++){
                mat[t][i] = num;
                num++;
            }
            t++;
            for(int i = t ; i <= b ; i++){
                mat[i][r] = num;
                num++;
            }
            r--;
            if(l <= r){
            for(int i = r ; i >= l ; i-- ){
                mat[b][i] = num;
                num++;
            }
            b--;
          } 
          if(t <= b){
            for(int i = b ; i >= t ; i--){
                mat[i][l] = num;
                num++;
            }
            l++;
          }
        }
        return mat;
    }
}