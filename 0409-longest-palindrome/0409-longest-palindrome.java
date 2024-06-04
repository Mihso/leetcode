class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> mapper = new HashMap<>();
        int counter = 0;
        for(char c: s.toCharArray()){
            if(!mapper.containsKey(c)){
                mapper.put(c, 0);
            }
            
            mapper.put(c, mapper.get(c) + 1);
        }
        boolean odder = false;
        for(char c: mapper.keySet()){
            if(mapper.get(c) % 2 == 0){
                counter += mapper.get(c);
            }
            else{
                counter += mapper.get(c) - 1;
                odder = true;
            }
        }
        if(odder){
            return counter + 1;
        }
        return counter;
        
    }
}