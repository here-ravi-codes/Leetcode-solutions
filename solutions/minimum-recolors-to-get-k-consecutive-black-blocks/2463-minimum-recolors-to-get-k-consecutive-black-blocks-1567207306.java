class Solution {
    public int minimumRecolors(String s, int l) {
        int n = s.length();
        int i=0;
        int min = Integer.MAX_VALUE;
        while(i < n - l + 1){
           int j = i + l-1;
           int w =0;
           int b=0;
           for(int k=i;k<=j;k++){
              if(s.charAt(k) == 'B'){
                b++;
              }else{
                w++;
              }
           }
           min = Math.min(w,min);
           i++;
        }
        return min;
    }
}