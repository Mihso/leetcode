class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        recur("(", 1, n, answer);
        return answer;
    }
    
    private void recur(String s,int counter, int n, List<String> stringer){
        if(s.length() == n*2 && counter == 0){
            stringer.add(s);
        }
        else if(s.length() < n*2 && counter >= 0){
            recur(s+")", counter -1, n, stringer);
            recur(s+"(", counter +1, n, stringer);
        }
    }
}