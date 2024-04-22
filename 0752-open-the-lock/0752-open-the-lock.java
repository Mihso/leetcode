class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> checked = new HashSet<>();
        ArrayList<int[]> pending = new ArrayList<>();
        
        for(String s: deadends){
            checked.add(s);
        }
        if(checked.contains("0000")){
            return -1;
        }
        pending.add(new int[] {0,0,0,0});
        checked.add("0000");
        
        int moves = 0;
        while(!pending.isEmpty()){
            int current = pending.size();
            for(int i = 0; i < current; i++){
                int[] comb = pending.get(0);
                if(convert(comb).equals(target)){
                    return moves;
                }
                
                for(int x = 0; x < comb.length; x++){
                    comb[x] = changer(comb[x], true);
                    if(!checked.contains(convert(comb))){
                        pending.add(comb.clone());
                        checked.add(convert(comb));
                    }
                    comb[x] = changer(comb[x], false);
                    comb[x] = changer(comb[x], false);
                    if(!checked.contains(convert(comb))){
                        pending.add(comb.clone());
                        checked.add(convert(comb));
                    }
                    comb[x] = changer(comb[x], true);

                }
                
                pending.remove(0);
            }
            moves += 1;
        }
        
        return -1;
    }
    
    public int changer(int value, Boolean increase){
        int result = value;
        if(increase){
            result += 1;
            if(result == 10){
                result = 0;
            }
        }
        else{
            result -= 1;
            if(result == -1){
                result = 9;
            }
        }
        return result;
    }
    
    public String convert(int[] comb){
        String result = "";
        for(int c: comb){
            result += c;
        }
        return result;
    }
}