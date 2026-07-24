class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int c = 0;
        if(n < 2){
            return true;
        }
        for(int i = 1 ; i < n ; i++){
            if(nums[i] < nums[i-1]){
                if(c == 0){
                    c = 1;
                }
                else if(c == -1){
                    return false;
                }
            }
            else if(nums[i] > nums[i-1]){
                if(c == 0){
                    c = -1;
                }
                else if(c == 1){
                    return false;
                }
            }
        }
        return true;
    }
}