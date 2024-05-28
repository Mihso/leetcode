class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int totalCost = 0;
        int lengther = s.length();
        int start = 0;
        int maxi = 0;
        
        for(int i =0; i < s.length(); i++){
            totalCost += Math.abs(Integer.valueOf(s.charAt(i)) - Integer.valueOf(t.charAt(i)));
            while(maxCost < totalCost){
                totalCost-= Math.abs(Integer.valueOf(s.charAt(start)) - Integer.valueOf(t.charAt(start))); 
                start++;
            }
            
            maxi = Math.max(maxi, i - start + 1);
        }
        return maxi;
    }
}