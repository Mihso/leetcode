class Solution {
    public String longestWord(String[] words) {
        String answer = "";
        Queue<String> q = new PriorityQueue<>();
        
        for(String word: words){
            if(word.length() == 1){
                q.add(word);
            }
        }
        while(!q.isEmpty()){
            String current = q.poll();
            if(current.length() > answer.length()){
                answer = current;
            }
            for(String word: words){
                if(word.substring(0,word.length() - 1).equals(current)){
                    q.add(word);
                }
            }    
        }
        
        return answer;
    }
}