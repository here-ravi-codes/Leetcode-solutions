class Solution {
    public String frequencySort(String s) {
        // char[] charS = s.toCharArray();
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < charS.length; i++){
        //     map.put(charS[i], map.getOrDefault(charS[i], 0) + 1);
        // }
        // TreeMap<Integer, String> tree = new TreeMap<>(Collections.reverseOrder());
        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     tree.put(entry.getValue(), tree.getOrDefault(entry.getValue(), "") + entry.getKey());
        // }
        // StringBuilder result = new StringBuilder();
        // for(Map.Entry<Integer, String> entry : tree.entrySet()){
        //     if(entry.getKey() > 1){
        //         for(char ch : entry.getValue().toCharArray()){
        //             for(int i = 0; i < entry.getKey(); i++){
        //                 result.append(ch);
        //             }
        //         }
        //     }
        //     else{
        //         result.append(entry.getValue());
        //     }
        // }
        // return result.toString();




        // int[] freq = new int[128];
        // for(char ch : s.toCharArray()){
        //     freq[ch]++;
        // }
        // Comparator<Character> cmp = (a,b) ->{
        //     if(freq[a] == freq[b]){
        //         return a-b;
        //     }
        //     return freq[b] - freq[a];
        // };
        // List<Character> charList = new ArrayList<>();
        // for(char ch : s.toCharArray()){
        //     charList.add(ch);
        // }
        // charList.sort(cmp);
        // StringBuilder result = new StringBuilder();
        // for(char ch : charList){
        //     result.append(ch);
        // }
        // return result.toString();



        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(map.entrySet());
        charList.sort((a,b) -> b.getValue()-a.getValue());
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: charList){
            char ch = entry.getKey();
            int freq = entry.getValue();
            for(int i = 0; i < freq; i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}