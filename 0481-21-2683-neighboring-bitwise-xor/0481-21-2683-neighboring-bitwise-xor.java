class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int[] org = new int[derived.length];
        for(int i = 1; i < org.length; i++){
            org[i] = derived[i - 1] ^ org[i - 1];
        }
        for(int i = 0; i < org.length; i++){
            int current = (i + 1) % org.length;
            if(derived[i] != (org[i] ^ org[current])){
                return false;
            }
        }
        return true;
    }
}