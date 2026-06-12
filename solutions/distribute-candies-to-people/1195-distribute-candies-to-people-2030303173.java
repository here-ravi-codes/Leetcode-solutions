class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int counter = 1;
        int i = 0;
        while(candies > 0){
            int dist = Math.min(counter, candies);
            res[i++ % num_people] += dist;
            counter++;
            candies -= dist;
        }
        return res;
    }
}