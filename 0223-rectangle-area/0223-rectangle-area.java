class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        if(ax1> bx2 || bx1 > ax2 || ay1> by2 || by1 > ay2){
            return ((ax2 - ax1)*(ay2 - ay1)) + ((bx2-bx1)*(by2-by1)) ;
        }
        return( ((ax2 - ax1)*(ay2 - ay1)) + ((bx2-bx1)*(by2-by1)) - ( (Math.min(bx2,ax2)-Math.max(bx1,ax1)) * (Math.min(by2, ay2)-Math.max(by1, ay1)) ));
    }
}