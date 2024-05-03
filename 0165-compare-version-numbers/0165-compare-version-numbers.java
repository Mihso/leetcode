class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.", 0);
        String[] v2 = version2.split("\\.", 0);
        for(int i = 0; i < Math.min(v1.length, v2.length); i++){
            int v1Int = Integer.valueOf(v1[i]);
            int v2Int = Integer.valueOf(v2[i]);
            if(v1Int > v2Int){
                return 1;
            }
            else if(v1Int < v2Int){
                return -1;
            }
        }
        
        int dif = Math.abs(v1.length - v2.length);
        if(v1.length > v2.length){
            while(dif > 0){
                if(Integer.valueOf(v1[v1.length - dif]) != 0){
                    return 1;
                }
                dif -= 1;
            }
        }
         else if(v2.length > v1.length){
            while(dif > 0){
                if(Integer.valueOf(v2[v2.length - dif]) != 0){
                    return -1;
                }
                dif -= 1;
            }
        }
        
        return 0;
    }
}