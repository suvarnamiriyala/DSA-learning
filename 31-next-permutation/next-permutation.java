class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        int i = n-2;
        for( i = n-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind != -1){
            int j = n-1;
            while(nums[j] <= nums[ind]){
                j--;
            }
            swap(nums , ind ,j);
        }
        reverse(nums , ind+1 , n-1);
    }
        private void swap(int[] nums , int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private void reverse(int[] nums , int s , int e){
            while(s < e){
                swap(nums , s++ , e--);
            }
        }
}