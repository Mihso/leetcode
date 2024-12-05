class Solution {
    public boolean canChange(String start, String target) {
        Queue<Character> order = new LinkedList<>();
        Queue<Character> targetOrder = new LinkedList<>();
        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) != '_'){
                order.add(start.charAt(i));
            }
            if(target.charAt(i) != '_'){
                targetOrder.add(target.charAt(i));
            }
        }
        int indexstart = 0;
        int indextarget = 0;
        while(!order.isEmpty() && !targetOrder.isEmpty()){
            char current = order.remove();
            char currentTarget = targetOrder.remove();
            int trackerstart = indexstart;
            int trackertarget = indextarget;
            while(trackerstart < start.length() - 1 && start.charAt(trackerstart) == '_'){
                trackerstart += 1;
            }
            while(trackertarget < target.length() - 1 && target.charAt(trackertarget) == '_'){
                trackertarget += 1;
            }
            
            if(currentTarget != current){
                return false;
            }
            
            if(current == 'L' && trackertarget > trackerstart){
                return false;
            }
            else if(current == 'R' && trackertarget < trackerstart){
                return false;
            }
            indexstart = trackerstart + 1;
            indextarget = trackertarget + 1;
            
        }
        return order.size() == targetOrder.size();
    }
}