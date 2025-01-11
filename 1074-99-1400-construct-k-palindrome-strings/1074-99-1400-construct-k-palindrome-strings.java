class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character, Integer> counter = new HashMap<>();
        if(s.length() < k){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            int count = counter.getOrDefault(s.charAt(i), 0);
            counter.put(s.charAt(i), count + 1);
        }

        int oddCounter = 0;
        for(char key: counter.keySet()){
            if(counter.get(key) % 2 != 0){
                oddCounter += 1;
            }
        }

        return oddCounter <= k;
    }
}