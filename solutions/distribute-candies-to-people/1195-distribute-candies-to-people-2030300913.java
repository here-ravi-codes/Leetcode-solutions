class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int counter = 1;
        while(candies != 0){
            for(int i = 0; i < num_people; i++){
                int dist = Math.min(counter, candies);
                res[i] += dist;
                counter++;
                candies -= dist;
                if(candies == 0) break;
            }
        }
        return res;
    }
}