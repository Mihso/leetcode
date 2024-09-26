class MyCalendar {
    List<int[]> events;
    public MyCalendar() {
        events = new ArrayList<int[]>();
    }
    
    public boolean book(int start, int end) {
        Collections.sort(events, (a,b) -> a[0] -b[0]);
        if(events.size() == 0){
            events.add(new int[]{start, end});
        }
        else{
            int index = 0;
            while(index < events.size() && start >= events.get(index)[1]){
                index++;
            }
            
            
            if(index < events.size()){
                if(end <= events.get(index)[0]){
                    events.add(new int[]{start,end});
                    return true;
                }
                if(start < events.get(index)[1]){
                    return false;
                }
            }
            else{
                events.add(new int[]{start,end});
                return true;
            }
            
        }
        events.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */