class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        int runningSum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        int target = totalSum/3;
        if(totalSum % 3 != 0) return false;
        for(int i = 0; i < arr.length; i++){
            runningSum += arr[i];
            if(runningSum == target){
                count += 1;
                runningSum = 0;
            }
            if(count == 2 && i < arr.length - 1) return true;
        }
        return false;
    }
}