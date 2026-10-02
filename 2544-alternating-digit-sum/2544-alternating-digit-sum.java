class Solution {
    public int alternateDigitSum(int n) {
        int c = 0;
        int s1 = 0;
        int s2 = 0;
        int temp = n;
        while(temp != 0){
            int d = temp%10;
            if(c%2 == 0){
                s1+=d;
            }
            else{
                s2+=d;
            }
            temp = temp/10;
            c++;
        }
        int r = s1-s2;
        if(c%2 == 0){
            r = -r;
        }
        return r;
       
    }
}