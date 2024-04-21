class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Stack<Integer> container = new Stack<>();
        container.push(source);
        Boolean found = false;
        if(source == destination){
            return true;
        }
        while(!container.isEmpty()){
            int current = container.pop();
            for(int i = 0; i< edges.length; i++){
                
                if(edges[i] != null){
                if(edges[i][0] == current || edges[i][1] == current){
                    if(edges[i][0] == destination || edges[i][1] == destination){
                        return true;
                    }
                    else if(edges[i][0] == current){
                        container.push(edges[i][1]);
                    }
                    else{
                        container.push(edges[i][0]);
                    }
                    edges[i] = null;
                }
                }
            }
        }
        
        return false;
    }
}