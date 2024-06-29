class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> values = new ArrayList<>();
        List<Integer>[] asc = new ArrayList[n];
        
        for(int i =0; i < n; i++){
            asc[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i < n; i++){
            values.add(new ArrayList<Integer>());
        }
        
        for(int[] i: edges){
            asc[i[1]].add(i[0]);
        }

        for(int i = 0 ; i < n; i++){
            climb(asc[i], asc, values.get(i));
            Collections.sort(values.get(i));
        }
        
        
        return values;
        
    }
    
    private void climb(List<Integer> current, List<Integer>[] asc, List<Integer> values){
        for(int i : current){
            if(!values.contains(i)){
                values.add(i);
                climb(asc[i], asc, values);
            }
        }
    }
    
}