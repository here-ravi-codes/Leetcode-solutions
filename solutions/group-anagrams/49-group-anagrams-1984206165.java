class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            //M1 - sorting

            // char[] arr = strs[i].toCharArray();
            // Arrays.sort(arr);
            // String s = new String(arr);

            //M2 - frequencyArray

            int[] count = new int[26];
            for(char c : strs[i].toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j : count){
                sb.append('#');
                sb.append(j);
            }
            String s = sb.toString();
            

            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                ArrayList<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s, l);
            }
        }
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}