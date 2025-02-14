class ProductOfNumbers {
    private List<Integer> values;
    public ProductOfNumbers() {
        this.values = new ArrayList<Integer>();
        this.values.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            this.values = new ArrayList<Integer>();
            this.values.add(1);
        }
        else{
            this.values.add(this.values.get(this.values.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        if(k >= this.values.size()){
            return 0;
        }
        return this.values.get(this.values.size() - 1) / this.values.get(this.values.size() - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */