class Solution {
    public String pushDominoes(String dominoes) {
        char[] answer = new char[dominoes.length()];
        Arrays.fill(answer, '.');
        Set<Integer> mid = new HashSet<>();
        int right = -1;
        int left = 0;
        for(int i = 0; i < dominoes.length(); i++){
            char current = dominoes.charAt(i);
            if(current == 'R'){
                if(right >= 0){
                    for(int x = right; x <= i; x++){
                        answer[x] = 'R';
                    }
                }
                right = i;
            }
            else if(current == 'L'){
                if(right >= 0){
                    int lefter = i;
                    int righter = right;
                    while(righter < lefter){
                        answer[righter] = 'R';
                        answer[lefter] = 'L';
                        righter += 1;
                        lefter -= 1;
                    }
                    right = -1;
                }
                else{
                    for(int x = left; x <= i; x++){
                        answer[x] = 'L';
                    }
                }
                left = i;
            }

        }
        if(right >= 0){
            for(int i = right; i < dominoes.length(); i++){
                answer[i] = 'R';
            }
        }
        for(int i  = 0; i < dominoes.length(); i++){
            if(answer[i] == '.'){
                answer[i] = dominoes.charAt(i);
            }
        }
        return new String(answer);
    }
}