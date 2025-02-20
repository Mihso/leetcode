class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> binary = new HashSet<>();
        int n = 0;
        for(String s: nums){
            n = s.length();
            binary.add(s);
        }
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            String current = Integer.toBinaryString(i);
            while(current.length() < n){
                current = '0' + current;
            }
            if(!binary.contains(current)){
                return current;
            }
        }
        return "";
    }
}