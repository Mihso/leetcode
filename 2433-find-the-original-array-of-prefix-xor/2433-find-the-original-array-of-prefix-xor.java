class Solution {
    public int[] findArray(int[] pref) {
        int[] copy = new int[pref.length];
        copy[0] = pref[0];
        for(int i = 1; i< pref.length; i++){
            copy[i] = pref[i] ^ pref[i-1];
        }
        return copy;
    }
}