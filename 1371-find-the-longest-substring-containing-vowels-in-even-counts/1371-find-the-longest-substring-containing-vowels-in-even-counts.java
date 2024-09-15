class Solution {
    public int findTheLongestSubstring(String s) {
        int lengther = s.length() - 1;
        
        if(counter(s)){
            return s.length();
        }
        
        while(lengther > 0){
            for(int i = 0; i < s.length() + 1 - lengther; i++){
                String subber = s.substring(i, i + lengther);
                if(counter(subber)){
                    return subber.length();
                }
            }
            lengther--;
        }
        return 0;
        
    }
    private boolean counter(String s){
        Map<Character, Integer> mapper = new HashMap<>();
        mapper.put('a', 0);
        mapper.put('e', 0);
        mapper.put('i', 0);
        mapper.put('o', 0);
        mapper.put('u', 0);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(mapper.containsKey(c)){
                mapper.put(c, mapper.get(c) + 1);
            }
        }
        
        for(Integer i: mapper.values()){
            if(i % 2 != 0){
                return false;
            }
        }
        return true;
    }
}