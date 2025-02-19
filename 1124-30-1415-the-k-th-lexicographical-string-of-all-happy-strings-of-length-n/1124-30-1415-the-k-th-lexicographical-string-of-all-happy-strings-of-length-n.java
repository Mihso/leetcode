class Solution {
    public String getHappyString(int n, int k) {
        List<String> happy = new ArrayList<>();
        happy(happy, "", n);
        if(k > happy.size()){
            return "";
        }
        return happy.get(k - 1);
    }

    public void happy(List<String> happ, String current, int k){
        if(current.length() >= k){
            if(!happ.contains(current)){
                happ.add(current);
            }
        }
        else{
            char[] letters = new char[]{'a','b','c'};
            for(char c: letters){
                if(current.length() == 0 || current.charAt(current.length() - 1) != c){
                    happy(happ, current + c, k);
                }
            }
        }
    }
}