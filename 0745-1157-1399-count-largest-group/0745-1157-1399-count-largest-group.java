class Solution {
    public int countLargestGroup(int n) {
        int answer = 0;
        Map<Integer, Integer> mapper = new HashMap<>();
        int largest = 0;
        for(int i = 1; i <= n; i++){
            String value = Integer.toString(i);
            int summer = 0;
            for(int x = 0; x < value.length(); x++){
                summer += Character.getNumericValue(value.charAt(x));
            }

            mapper.put(summer, mapper.getOrDefault(summer, 0) + 1);
            largest = Math.max(largest, mapper.get(summer));
        }

        for(int i: mapper.keySet()){
            if(mapper.get(i) == largest){
                answer += 1;
            }
        }

        return answer;

    }
}