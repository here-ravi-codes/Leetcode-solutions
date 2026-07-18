import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(mapS.containsKey(charS)){
                if(mapS.get(charS) != charT){
                    return false;
                }
            }
            else if(mapT.containsKey(charT)){
                return false;
            }
            else{
                mapS.put(charS, charT);
                mapT.put(charT, charS);
            }
        }

        return true;
    }
}
