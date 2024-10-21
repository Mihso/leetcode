class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> subber = new HashSet<>();
        
        return backer(s, 0, subber);
        
    }
    private int backer(String s, int start, Set<String> subber){
        if(start == s.length()){
            return 0;
        }
        
        int maxCount = 0;
        
        for(int i = start + 1; i <= s.length(); i++){
            String sub = s.substring(start, i);
            if(!subber.contains(sub)){
                subber.add(sub);
                maxCount = Math.max(maxCount, 1 + backer(s, i, subber));
                subber.remove(sub);
            }
        }
        
        return maxCount;
    }
}