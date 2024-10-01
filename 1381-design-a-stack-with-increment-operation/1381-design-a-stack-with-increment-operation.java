class CustomStack {
    List<Integer> stacker = new ArrayList<>();
    int max;
    public CustomStack(int maxSize) {
        max = maxSize;
    }
    
    public void push(int x) {
        if(stacker.size() < max){
            stacker.add(x);
        }
    }
    
    public int pop() {
        if(stacker.size() > 0){
            return stacker.remove(stacker.size() - 1);
        }
        else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, stacker.size()); i++){
            stacker.set(i, stacker.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */