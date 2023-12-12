class Solution {
    public int lengthOfLastWord(String s) {
        System.out.println(s);
        String[] newer = s.split(" ");
        System.out.println(newer[newer.length - 1]);
        
        return newer[newer.length - 1].length();
    }
}