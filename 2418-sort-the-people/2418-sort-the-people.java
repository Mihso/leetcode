class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < names.length - 1; i++){
                if(heights[i] < heights[i + 1]){
                String name = names[i];
                int height = heights[i];
                names[i] = names[i+1];
                heights[i] = heights[i + 1];
                heights[i+1] = height;
                names[i+1] = name;
                swapped = true;
                }
            }
        }
        
        return names;
    }
}