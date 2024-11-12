class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> b[1] - a[1]);
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++){
            int index = 0;
            while(index < items.length && items[index][0] > queries[i]){
                index += 1;
            }
            if(index < items.length){
                answer[i] = items[index][1];
            }
            else{
                answer[i] = 0;
            }
        }
        
        return answer;
        
    }
}