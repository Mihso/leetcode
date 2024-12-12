class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i = 0; i < k; i++){
            int index = 0;
            for(int x = 0; x < gifts.length; x++){
                if(gifts[x] > gifts[index]){
                    index = x;
                }
            }
            gifts[index] = (int) Math.sqrt(gifts[index]);
        }
        
        long answer = 0;
        for(int i: gifts){
            answer += i;
        }
        return answer;
    }
}