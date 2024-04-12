class Solution {
    public int trap(int[] height) {
        int left = 0, leftH = height[left], answer = 0;
        int right = height.length - 1, rightH = height[right];
        
        while(left < right){
            if(leftH <= rightH){
                answer += leftH-height[left];
                left++;
                leftH = Math.max(leftH, height[left]);
     
                
            }
            else{
                answer += rightH-height[right];
                right--;
                rightH = Math.max(rightH, height[right]);
            }
        }
        
        return answer;
    }
}