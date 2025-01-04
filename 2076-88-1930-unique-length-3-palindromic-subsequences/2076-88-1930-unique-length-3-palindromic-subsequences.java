class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> answer = new HashSet<>();
        Set<Character> visited = new HashSet<>();
        pali(s, answer, visited);
        System.out.println(answer);
        return answer.size();

    }

    private void pali(String s, Set<String> answer, Set<Character> visited){
        for(int start = 0; start < s.length() - 1; start++){
            if(!visited.contains(s.charAt(start))){
                int end = s.length() - 1;
                while(end > start && s.charAt(end) != s.charAt(start)){
                    end -= 1;
                }
                if(s.charAt(start) == s.charAt(end) && !visited.contains(s.charAt(start)) && start != end){
                    for(int i = start + 1; i < end; i++){
                        answer.add(s.charAt(start) +""+ s.charAt(i) +""+ s.charAt(end));
                    }
                    visited.add(s.charAt(start));
                }
            }
        }
    }
}