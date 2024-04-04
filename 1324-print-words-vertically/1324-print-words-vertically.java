class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> answer = new ArrayList<String>(); 
        
        int maxi = 0;
        
        for(int w = 0; w< words.length; w++){
            maxi = Math.max(maxi, words[w].length());
        }
        
        for(int w = 0;w < words.length; w++){
            while(words[w].length() < maxi){
                words[w] += " ";
            }
        }
        
        for(int i = 0; i < maxi; i++){
            String unit = "";
            
            for(String w: words){
                unit += w.charAt(i);
            }
            
            while(unit.charAt(unit.length() - 1) == ' '){
                unit = unit.substring(0, unit.length()-1);
            }
            
            answer.add(unit);
            
        }
        
        return answer;
    }
}