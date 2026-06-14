class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int p1 = i + j;
                int p2 = i + j + 1;
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = result[p2] + mul;
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index < result.length && result[index] == 0){
            index++;
        }
        while(index < result.length){
            sb.append(result[index]);
            index++;
        }
        return sb.toString();
    }
}