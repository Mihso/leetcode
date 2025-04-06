class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return new ArrayList<>();
        }
        int maxi = 0;
        int[] longest = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(prev, -1);
        Arrays.fill(longest, 1);
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0 && longest[j] + 1 > longest[i]){
                    longest[i] = longest[j] + 1;
                    prev[i] = j;
                }
            }
            if(longest[i] > longest[maxi]){
                maxi = i;
            }
        }
        List<Integer> answer = new ArrayList<>();

        while(maxi >= 0){
            answer.add(nums[maxi]);
            maxi = prev[maxi];
        }
        return answer;
    }
}