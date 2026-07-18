class Solution {
    public int[][] generateMatrix(int n) {
        //initialize a 2d matrix with all 0's
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = 0;
            }
        }        
        //initialize left, right, top, bottom
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        //initialize value to fill in the matrix
        int val = 1;
        //while loop with termination
        while(left <= right){
            //fill top row in range left to right, increase top
            for(int i = left; i <= right; i++){
                ans[top][i] = val;
                val++;
            }
            top++;
            //fill right col in range top to bottom, decrease right
            for(int i = top; i <= bottom; i++){
                ans[i][right] = val;
                val++;
            }
            right--;
            //fill bottom row in range right to left, decrease bottom
            for(int i = right; i >= left; i--){
                ans[bottom][i] = val;
                val++;
            }
            bottom--;
            //fill left row in range bottom to top, increase left
            for(int i = bottom; i >= top; i--){
                ans[i][left] = val;
                val++;
            }
            left++;
        }
        //return matrix;
        return ans;
    }
}