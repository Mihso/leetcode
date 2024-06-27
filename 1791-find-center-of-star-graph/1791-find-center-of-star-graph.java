class Solution {
    public int findCenter(int[][] edges) {
        List<Integer> found = new ArrayList<>();
        
        for(int[] i: edges){
            for(int y: i){
                if(found.contains(y)){
                    return y;
                }
                else{
                    found.add(y);
                }
            }
        }
        return 0;
    }
}