class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int s = 0;
        for(int i = 0 ; i < nums.length ; i++){
        s+=nums[i];
        r[i] = s;
        }
        return r;
    }
}