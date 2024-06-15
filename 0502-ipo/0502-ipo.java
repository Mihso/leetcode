class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<int[]> pairs = new ArrayList<>(); 
        int counter = 0;
        
        for(int i = 0; i < profits.length; i++){
            pairs.add(new int[] {profits[i], capital[i]});
        }
        
        PriorityQueue<int[]> q = new PriorityQueue<>((int[]a, int[] b) -> b[0] - a[0]);
        
        while(counter < k){
            int index = 0;
            while(index < pairs.size()){
                if(pairs.get(index)[1] <= w){
                    q.add(pairs.get(index));
                    pairs.remove(index);
                }
                else{
                    index++;
                }
            }
            if(q.isEmpty()){
                break;
            }
            
            else{
                w += q.poll()[0];
            }
            
            counter++;
            
        }
        return w;
        
    }
}