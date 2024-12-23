class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
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