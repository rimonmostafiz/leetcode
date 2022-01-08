class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        
        while (i < s.length() && j < t.length()) {
            char sc = s.charAt(i);
            char tc = t.charAt(j);
            
            if (sc == tc) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        
        if (i == s.length()) return true;
        else return false;
    }
}