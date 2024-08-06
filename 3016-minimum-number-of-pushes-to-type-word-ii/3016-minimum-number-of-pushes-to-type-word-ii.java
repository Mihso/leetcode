class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> counts = new HashMap<>();
        int score = 0;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            
            if(!counts.containsKey(c)){
                counts.put(c, 0);
            }
            counts.put(c, counts.get(c) + 1);
            
        }
        
        int index = 2;
        int next = 1;
        Integer[] values = new Integer[counts.size()];
        int i2 = 0;
        for(int i : counts.values()){
            values[i2] = i;
            i2++;
        }
        Arrays.sort(values, Collections.reverseOrder());
        for(int i : values){
            score += i * next;
            index++;
            if(index > 9){
                next++;
                index = 2;
            }
        }
        
        System.out.println(counts);
        
        return score;
        
        
    }
}