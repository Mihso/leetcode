class Solution {
    List<List<String>> answer = new ArrayList<>();
    public List<List<String>> partition(String s) {
        parter(s, new ArrayList<String>());
        return answer;
    }
    
    public boolean isPalin(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public void parter(String s, List<String> lister){
        if(s.length() == 0){
            answer.add(lister);
        }
        else if(s.length() == 1){
            List<String> copy = new ArrayList<>(lister);
            copy.add(s);
            answer.add(copy);
        }
        else{
        for(int i = 0; i < s.length(); i++){
            String subber = s.substring(0, i + 1);
            String subber2 = s.substring(i + 1, s.length());
            if(isPalin(subber)){
                List<String> copy = new ArrayList<>(lister);
                copy.add(subber);
                System.out.println(copy);
                parter(subber2, copy);
            }
        }
        }
        
    }
}