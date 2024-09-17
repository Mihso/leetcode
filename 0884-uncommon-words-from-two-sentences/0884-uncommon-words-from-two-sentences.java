class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] splitter1 = s1.split(" ");
        String[] splitter2 = s2.split(" ");
        Map<String, Integer> mapper = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for(String s: splitter1){
                if(!mapper.containsKey(s)){
                    mapper.put(s, 0);
                }
                mapper.put(s, mapper.get(s) + 1);
        }
        for(String s: splitter2){
                if(!mapper.containsKey(s)){
                    mapper.put(s, 0);
                }
                mapper.put(s, mapper.get(s) + 1);
        }
        
        for(String s: mapper.keySet()){
            if(mapper.get(s) == 1){
                answer.add(s);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
        
    }
}