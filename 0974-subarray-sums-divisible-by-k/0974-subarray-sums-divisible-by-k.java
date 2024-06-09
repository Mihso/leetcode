class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> positive = new HashMap<>();
        Map<Integer, Integer> negative = new HashMap<>();
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            
            int val = nums[i] % k;
            if(val >= 0){
                if(!positive.containsKey(val)){
                    positive.put(val, 0);
                }
                    positive.put(val, positive.get(val) + 1);
                
                for(int x: negative.keySet()){
                    if((val - x) % k == 0){
                        answer += negative.get(x);
                    }
                }
            }
            else{
                if(!negative.containsKey(val)){
                    negative.put(val, 0);
                }
                    negative.put(val, negative.get(val) + 1);
                
                    for(int x: positive.keySet()){
                        if((val - x) % k == 0){
                            answer += positive.get(x);
                        }
                    }
            }
            
            
            if(val == 0){
                answer += 1;
            }
            
        }
        for(int val: positive.values()){
            answer += counter(val);
        }
        for(int val: negative.values()){
            answer += counter(val);
        }
        
        return answer;
    }
    
    public int counter(int k){
        int answer = 0;
        while(k - 1 > 0){
            answer += k-1;
            k--;
        }
        return answer;
    }
}