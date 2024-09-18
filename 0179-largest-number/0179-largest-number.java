class Solution {
    public String largestNumber(int[] nums) {
 
        String[] strings = new String[nums.length];
        for(int i =0 ; i < nums.length; i++){
            strings[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(strings, (a, b) -> (b + a).compareTo(a+b));
        String answer = "";
        
        if(strings[0].equals("0")){
            return "0";
        }
        for(String s: strings){
            answer += s; 
        }
        
        return answer;
    }
}