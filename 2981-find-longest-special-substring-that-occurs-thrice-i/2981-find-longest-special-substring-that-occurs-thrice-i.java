class Solution {
    public int maximumLength(String s) {
        Map<String, Integer> subber = new HashMap<>();
        int lengther = -1;
        int current = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(current) != s.charAt(i)){
                String temp = s.substring(current, i);
                int counter = 1;
                while(temp.length() > 0){
                    subber.put(temp, subber.getOrDefault(temp, 0) + counter);
                    temp = temp.substring(0, temp.length() - 1);
                    counter++;
                }
                
                current = i;
            }
        }
        
        String temp = s.substring(current, s.length());
        int counter = 1;
        while(temp.length() > 0){
            subber.put(temp, subber.getOrDefault(temp, 0) + counter);
            temp = temp.substring(0, temp.length() - 1);
            counter++;
        }
        
        for(String key: subber.keySet()){
            if(key.length() > lengther && subber.get(key) >= 3){
                lengther = key.length();
            }
        }
                
        return lengther;
    }
}