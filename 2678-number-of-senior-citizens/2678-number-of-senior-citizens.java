class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        for(String s: details){
            if(Integer.parseInt(s.substring(11,13)) > 60){
                counter++;
            }
        }
        return counter;
    }
}