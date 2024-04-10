class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i: image){
            int left = 0;
            int right = i.length-1;
            
            while(left <= right){
                int store = i[left];
                
                i[left] = i[right];
                i[right] = store; 
                
                left += 1;
                right -= 1;
            }
            
            for(int unit = 0; unit < i.length; unit++){
                if(i[unit]==0){
                    i[unit] = 1;
                }
                else{
                    i[unit] = 0;
                }
            }
            
        }
        
        return image;
    }
}