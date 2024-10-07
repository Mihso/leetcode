class Solution {
    public int minLength(String s) {
        while(s.contains("CD") || s.contains("AB")){
            s = s.replaceAll("AB", "");
            s = s.replaceAll("CD", "");
        }
        return s.length();
    }
}