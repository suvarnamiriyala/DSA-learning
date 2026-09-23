class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num , hm.get(num)+1);
            }
            else{
                hm.put(num , 1);
            }
        }
        for(int freq : hm.values()){
            if(freq > n/2){
                for(int key : hm.keySet()){
                    if(hm.get(key) == freq){
                        return key;
                    }
                }
            }
        }
        return -1;
    }
}