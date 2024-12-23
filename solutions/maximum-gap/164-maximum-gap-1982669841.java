class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        int maxGap = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(n < 2) return 0;
        for(int i = 0; i < n; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int bucketSize = (int)Math.ceil((double)(max-min)/(n -1));
        int[] maxOfBucket = new int[n - 1];
        int[] minOfBucket = new int[n - 1];
        Arrays.fill(maxOfBucket, Integer.MIN_VALUE);
        Arrays.fill(minOfBucket, Integer.MAX_VALUE);
        for(int i = 0; i < n; i++){
            if(nums[i] == min || nums[i] == max) continue;
            int bucketIndForCurrEl = (nums[i] - min) / bucketSize;
            maxOfBucket[bucketIndForCurrEl] = Math.max(maxOfBucket[bucketIndForCurrEl], nums[i]);
            minOfBucket[bucketIndForCurrEl] = Math.min(minOfBucket[bucketIndForCurrEl], nums[i]);
        }
        for(int i = 0; i < n - 1; i++){
            if(maxOfBucket[i] == Integer.MIN_VALUE) continue;
            maxGap = Math.max(maxGap, minOfBucket[i] - min);
            min = maxOfBucket[i];
        }
        maxGap = Math.max(maxGap, max - min);
        return maxGap;
    }
}