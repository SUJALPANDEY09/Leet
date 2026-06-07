class StockSpanner {
    class pairs{
        int price;
        int span;
        pairs(int price,int span){
            this.price = price;
            this.span = span;
        }
    }
    Stack<pairs> st = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().price<=price){
            span += st.peek().span;
            st.pop();
        }
        st.push(new pairs(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */