class Solution {
    public String frequencySort(String s) {
        //Iterate the char array and put into map
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //create an array of list of length equals to the length of string length + 1 (max frequency)
        List<Character>[] arr = new ArrayList[s.length() + 1];
        //iterate the map and put the elements in the list where its index = frequency
        map.keySet().forEach(
            c -> {
                if(arr[map.get(c)] == null){
                    arr[map.get(c)] = new ArrayList();
                }
                arr[map.get(c)].add(c);
            }
        );
        //iterate the array from last(highest frequency first), iterate the list and append into a StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] != null){
                for(char c : arr[i]){
                    //iterate to the number of times it is present(index i represent that number)
                    for(int j = 0; j < i; j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}