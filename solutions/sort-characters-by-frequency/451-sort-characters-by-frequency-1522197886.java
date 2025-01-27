class Solution {
    public String frequencySort(String s) {
        char[] charS = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < charS.length; i++){
            map.put(charS[i], map.getOrDefault(charS[i], 0) + 1);
        }
        TreeMap<Integer, String> tree = new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            tree.put(entry.getValue(), tree.getOrDefault(entry.getValue(), "") + entry.getKey());
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer, String> entry : tree.entrySet()){
            if(entry.getKey() > 1){
                for(char ch : entry.getValue().toCharArray()){
                    for(int i = 0; i < entry.getKey(); i++){
                        result.append(ch);
                    }
                }
            }
            else{
                result.append(entry.getValue());
            }
        }
        return result.toString();
    }
}