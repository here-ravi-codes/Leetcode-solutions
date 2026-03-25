class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()  != t.length()) return false;
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(mapS.containsKey(chS)){
                if(mapS.get(chS) != chT) return false;
            }
            else{
                mapS.put(chS, chT);
            }
            if(mapT.containsKey(chT)){
                if(mapT.get(chT) != chS) return false;
            }
            else{
                mapT.put(chT, chS);
            }
        }
        return true;
    }
}