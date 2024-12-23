class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int count = 1;
        // int maxCount = 1;
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] - 1 == nums[i - 1]){
        //         count++;
        //         maxCount = Math.max(maxCount, count);
        //     }
        //     else if(nums[i] == nums[i - 1]) continue;
        //     else count = 1;
        // }
        // return maxCount;

        Set<Integer> set = new HashSet<>();
        int maxStreak = 0;
        for(int num : nums) set.add(num);
        for(int num : set){
            if(!(set.contains(num - 1))){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        return maxStreak;
    }
}