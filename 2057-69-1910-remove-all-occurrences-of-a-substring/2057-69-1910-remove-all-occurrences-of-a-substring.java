class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stringer = new StringBuilder(s);
        int index = 0;
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }

        return s;
    }
}