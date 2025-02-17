class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> combos = new HashSet<>();
        boolean[] occupied = new boolean[tiles.length()];
        for(int i = 0; i < occupied.length; i++){
            String s = "" + tiles.charAt(i);
            occupied[i] = true; 
            combos(combos, s, occupied, tiles);
            occupied[i] = false;
        }
        return combos.size();

    }
    public void combos(Set<String> combos, String current, boolean[] occupied, String tiles){
        combos.add(current);
        for(int i = 0; i < occupied.length; i++){
            if(!occupied[i]){
                String s = current + tiles.charAt(i);
                occupied[i] = true;
                combos(combos, s, occupied, tiles);
                occupied[i] = false;
            }
        }
    }
}