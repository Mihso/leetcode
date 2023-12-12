class Solution {
    public int lengthOfLastWord(String s) {
        String[] newer = s.split(" ");   
        return newer[newer.length - 1].length();
    }
}