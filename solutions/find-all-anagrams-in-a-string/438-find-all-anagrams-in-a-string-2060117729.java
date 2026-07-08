class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length())
            return res;
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }
        int window = p.length();
        // Build first window
        for (int i = 0; i < window; i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        if (sMap.equals(pMap))
            res.add(0);
        // Slide the window
        for (int i = window; i < s.length(); i++) {
            char add = s.charAt(i);
            sMap.put(add, sMap.getOrDefault(add, 0) + 1);
            char remove = s.charAt(i - window);
            sMap.put(remove, sMap.get(remove) - 1);
            if (sMap.get(remove) == 0)
                sMap.remove(remove);
            if (sMap.equals(pMap))
                res.add(i - window + 1);
        }
        return res;
    }
}