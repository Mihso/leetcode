class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> mapper = new HashMap<>();

        for(int i= 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            int summer = 0;
            for(int j = 0; j < s.length(); j++){
                summer += Character.getNumericValue(s.charAt(j));
            }
            if(!mapper.containsKey(summer)){
                mapper.put(summer, new ArrayList<Integer>());
            }
            mapper.get(summer).add(nums[i]);
        }
        int answer = -1;
        for(int i: mapper.keySet()){
            List<Integer> numb = mapper.get(i);
            if(numb.size() >= 2){
                Collections.sort(numb, (a, b) -> b - a);
                answer = Math.max(answer, numb.get(0) + numb.get(1));
            }
        }
        return answer;
    }
}