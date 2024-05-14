class Solution {
    public boolean isAnagram(String s, String t) {
        char[] oner = s.toCharArray();
        char[] twoer = t.toCharArray();
        Arrays.sort(oner);
        Arrays.sort(twoer);
        if(Arrays.toString(oner).equals(Arrays.toString(twoer))){
            return true;
        }
        return false;
        
    }
}