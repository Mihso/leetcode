class MyCircularDeque {
    List<Integer> deque = new ArrayList<>();
    int max_size = 0;
    public MyCircularDeque(int k) {
        max_size = k;
    }
    
    public boolean insertFront(int value) {
        if(deque.size() >= max_size){
            return false;
        }
        else{
            deque.add(0, value);
            return true;
        }
    }
    
    public boolean insertLast(int value) {
        if(deque.size() >= max_size){
            return false;
        }
        else{
            deque.add(value);
            return true;
        }
    }
    
    public boolean deleteFront() {
        if(deque.size() <= 0){
            return false;
        }
        else{
            deque.remove(0);
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(deque.size() <= 0){
            return false;
        }
        else{
            deque.remove(deque.size() - 1);
            return true;
        }
    }
    
    public int getFront() {
        if(deque.size() == 0){
            return -1;
        }
        else{
            return deque.get(0);
        }
    }
    
    public int getRear() {
        if(deque.size() == 0){
            return -1;
        }
        else{
            return deque.get(deque.size() - 1);
        }
    }
    
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public boolean isFull() {
        return deque.size() == max_size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */