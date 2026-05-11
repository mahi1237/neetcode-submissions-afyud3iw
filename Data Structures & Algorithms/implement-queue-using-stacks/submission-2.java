class MyQueue {
     Stack <Integer> st;
    public MyQueue() {
        st=new Stack<>();
        
    }
    
    public void push(int x) {
        
        if(st.empty())
        {
            st.push(x);
            return;
        }
        // create a temp variable to store the elemrnt
        int temp=st.pop();
        push(x);
        st.push(temp);
    }
    
    public int pop() {
        if(st.empty())
        {
            System.out.println("Stck is empty");
            return -1;

        }
        return st.pop();
        
    }
    
    public int peek() {
         if(st.empty())
        {
            System.out.println("Stck is empty");
            return -1;

        }
        return st.peek();
        
        
    }
    
    public boolean empty() {
         if(st.empty())
        {
            System.out.println("Stck is empty");
            return true;

        }
        return false;
        
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */