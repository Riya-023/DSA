class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> mps = new HashMap<>();
        HashMap<Character, Character> mpt = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mps.containsKey(c1) && mps.get(c1) != c2) return false;
            if(mpt.containsKey(c2) && mpt.get(c2) != c1) return false;

            mps.put(c1, c2);
            mpt.put(c2, c1);
        }
        return true;
    }
}