class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String finaly = strs[0];
        for(int i = 1; i < strs.length; i++){
            Integer index = 0;
            while(strs[i].indexOf(finaly)!=0){
                finaly = finaly.substring(0, finaly.length() - 1);
                if(finaly.isEmpty()){
                    return "";
                }
            }
                
        }
        return finaly;
}
}