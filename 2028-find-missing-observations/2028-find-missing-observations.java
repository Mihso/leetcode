class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] answer = new int[n];
        
        int summer = 0;
        for(int i: rolls){
            summer += i;
        }
        
        int remain = (mean * (rolls.length + n)) - summer;
        int index = 0;
        int value = remain / n;
        if(remain > 6* n || remain < n){
            return new int[0];
        }
        Arrays.fill(answer, value);
        int mod = remain % n;        
        for(int i = 0; i < mod; i++){
            answer[i]++;
        }
        
        return answer;
        
    }
    
    public boolean match(int[] lister, int target){
        int sm = 0;
        for(int i: lister){
            sm += i;
        }
        
        return sm == target;
    }
}