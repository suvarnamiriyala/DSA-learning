class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int d = 1;
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i < n ; i++){
         if(max < nums[i]){
            max = nums[i];
         }
        }
        for(int i = 0 ; i < n ; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        for(int i = 1 ; i <= max && i <= min ; i++){
            if(min%i == 0 && max%i == 0){
                d = i;
            }
        }
        return d;
    }
}