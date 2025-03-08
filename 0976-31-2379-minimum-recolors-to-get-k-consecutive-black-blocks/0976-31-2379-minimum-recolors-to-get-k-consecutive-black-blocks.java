class Solution {
    public int minimumRecolors(String blocks, int k) {
        int answer = k;
        int counter = 0;
        int start = 0;
        for(int i = 0; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                counter += 1;
            }
            if(i - start >= k){
                if(blocks.charAt(start) == 'W'){
                    counter -= 1;
                }
                start += 1;
            }
            if(i - start == k - 1){
                answer = Math.min(answer, counter);
            }
        }

        return answer;
    }
}