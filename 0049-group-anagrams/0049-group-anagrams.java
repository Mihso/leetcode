class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapper = new HashMap<>();
        
        for(String s: strs){
            int[] freq = new int[26];
            Arrays.fill(freq, 0);
            for(int i = 0; i < s.length(); i++){
                freq[s.charAt(i)-'a']++;
            }
            String current = Arrays.toString(freq);
            
            if(!mapper.containsKey(current)){
                mapper.put(current, new ArrayList<String>());
            }
            
            mapper.get(current).add(s);
            
        }
        List<List<String>> answer = new ArrayList<>();
        
        answer.addAll(mapper.values());
        
        return answer;
        
    }
    
}