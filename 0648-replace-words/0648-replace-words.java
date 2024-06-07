class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        
        for(int i = 0; i < s.length; i++){
            String selected = s[i];
            for(String unit: dictionary){
                int lengther = unit.length();
                if(lengther <= s[i].length()){
                    String subber = s[i].substring(0, lengther);
                    if(subber.equals(unit) && unit.length() < selected.length()){
                        selected = unit;
                    }
                }
                
            }
            s[i] = selected;
        }
        String answer = "";
        for(String unit: s){
            answer += unit + " ";
        }
        return answer.substring(0,answer.length() - 1);
    }
}