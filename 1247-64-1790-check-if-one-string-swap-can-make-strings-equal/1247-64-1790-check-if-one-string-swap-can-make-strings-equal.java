class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int counter = 0;
        int left = 0;
        int right = s1.length() - 1;
        boolean found = false;
        while(left <= right){
            while(left < s1.length() && s1.charAt(left) == s2.charAt(left)){
                left += 1;
            }
            while(right >= 0 && s1.charAt(right) == s2.charAt(right)){
                right -= 1;
            }
            if(left <= right){
                if(s1.charAt(left) != s2.charAt(right)){
                    return false;
                }
                else if(s1.charAt(right) != s2.charAt(left)){
                    return false;
                }
                else{
                    if(found){
                        return false;
                    }
                    else{
                        found = true;
                    }
                }
            }
            left += 1;
            right -= 1;

        }
        return true;
    }
}