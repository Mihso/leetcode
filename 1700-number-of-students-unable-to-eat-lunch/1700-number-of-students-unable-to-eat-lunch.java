class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sand = 0;
        ArrayList<Integer> stacker = new ArrayList<>();
        
        for(int i: students){
            stacker.add(i);
        }
        
        
        int counter = 0;
        
        while(counter < stacker.size()){
            int current = stacker.get(0);
            stacker.remove(0);
            if(current != sandwiches[sand]){
                stacker.add(current);
                counter += 1;
            }
            else{
                sand += 1;
                counter = 0;
            }
            
        }
        
        return stacker.size();

        
    }
}