class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int cuts = -1;
        Arrays.sort(rectangles, (a, b) -> a[0] - b[0]);
        int previous = 0;
        for(int[] rectangle: rectangles){
            if(rectangle[0] >= previous){
                cuts += 1;
            }
            previous = Math.max(previous, rectangle[2]);
        }
        if(cuts >= 2){
            return true;
        }

        cuts = -1;
        Arrays.sort(rectangles, (a, b) -> a[1] - b[1]);
        previous = 0;
        for(int[] rectangle: rectangles){
            if(rectangle[1] >= previous){
                cuts += 1;
            }
            previous = Math.max(rectangle[3], previous);
        }
        if(cuts >= 2){
            return true;
        }

        return false;
    }
}