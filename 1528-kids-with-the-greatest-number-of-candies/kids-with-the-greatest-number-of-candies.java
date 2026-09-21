class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = 0;
        for(int i = 0 ; i < candies.length ; i++){
            m = Math.max(candies[i] , m);
        }
        List<Boolean> r = new ArrayList<>();
        for(int i = 0 ; i < candies.length ; i++){
            r.add(candies[i]+extraCandies >= m);
        }
        return r;
    }
}