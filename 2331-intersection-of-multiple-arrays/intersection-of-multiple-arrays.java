class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] f = new int[1001];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[i].length ; j++){
                f[nums[i][j]]++;
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < 1001 ; i++){
            if(f[i] == nums.length){
                l.add(i);
            }
        }
        return l;
    }
}