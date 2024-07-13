class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> answer = new ArrayList<>();
        Integer[] indices = new Integer[positions.length]; 
        int n = positions.length;
        Stack<Integer> right = new Stack<>();
        
        for(int i = 0; i < n; i++){
            indices[i] = i;
        }
        
        Arrays.sort(indices, (lh, rh) -> Integer.compare(positions[lh], positions[rh]));
        
        for(int current: indices){
            if(directions.charAt(current) == 'R'){
                right.push(current);
            }
            else{
                while(!right.isEmpty() && healths[current] > 0){
                    int top = right.pop();
                    if(healths[top] > healths[current]){
                        healths[top] -= 1;
                        right.push(top);
                        healths[current] = 0;
                    }
                    else if(healths[top] < healths[current]){
                        healths[current] -= 1;
                        healths[top] = 0;
                    }
                    else{
                        healths[current] = 0;
                        healths[top] = 0;
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(healths[i]> 0){
                answer.add(healths[i]);
            }
        }
        
        return answer;
        
    }
}