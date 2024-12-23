class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(int i = 0; i < n1; i++){
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        int windowSize = n1;
        for(int i = 0; i < windowSize; i++){
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);
        }
        if(map1.equals(window)) return true;

        for(int i = windowSize; i < n2; i++){
            char add = s2.charAt(i);
            window.put(add, window.getOrDefault(add, 0) + 1);
            char remove = s2.charAt(i - windowSize);
            window.put(remove, window.get(remove) - 1);
            if(window.get(remove) == 0){
                window.remove(remove);
            }
            if(map1.equals(window)) return true;
        }
        return false;
    }
}