class Solution {
    public int maximalRectangle(char[][] matrix) {
        int answer = 0;
        Integer[] tracker = new Integer[matrix[0].length];
        for(int i = 0; i < tracker.length; i++){
            tracker[i] = 0;
        }
        for(char[] c: matrix){
            for(int i = 0; i < c.length; i++){
                if(c[i] == '1'){
                    tracker[i] += 1;
                }
                else{
                    tracker[i] = 0;
                }
            }
            Stack<Integer> heights = new Stack<>();
            
            for(int h: tracker){
                if(!heights.contains(h)){
                    heights.add(h);
                }
            }
            
            for(int s: heights){
                int track = 0;
                for(int i : tracker){
                    if(i < s){
                        answer = Math.max(answer, track);
                        track = 0;
                    }
                    else{
                        track += s;
                    }
                }
                answer = Math.max(answer, track);
            }
            
        }
        
        return answer;
        
    }
    
}