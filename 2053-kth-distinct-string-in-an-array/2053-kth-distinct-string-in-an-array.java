class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> seen = new HashSet<>();
        Set<String> invalid = new HashSet<>();
        
        for(String s: arr){
            if(!seen.contains(s)){
                seen.add(s);
            }
            else{
                invalid.add(s);
            }
        }
        
        int counter = 0;
        int index = 0;
        while(counter <= k && index < arr.length){
            if(!invalid.contains(arr[index])){
                counter++;
                if(counter == k){
                    return arr[index];
                }
            }
            index++;
        }
        return "";
        
    }
}