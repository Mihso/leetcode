class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> folderset = new HashSet<>(Arrays.asList(folder));
        List<String> result = new ArrayList<>();
        
        for(String s: folder){
            boolean isSubFolder = false;
            String prefix = s;
            while(!prefix.isEmpty()){
                int index = prefix.lastIndexOf('/');
                if(index <= - 1){
                    break;
                }
                prefix = prefix.substring(0, index);
                if(folderset.contains(prefix)){
                    isSubFolder = true;
                    break;
                }
            } 
            
            if(!isSubFolder){
                result.add(s);
            }
        }
        return result;
    }
}