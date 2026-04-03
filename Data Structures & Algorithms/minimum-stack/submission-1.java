class MinStack {
   Stack <Integer> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.empty())
        {
            System.out.println("Stack is empty");
        }
        st.push(val);
        
    }
    
    public void pop() {
         if(st.empty())
        {
            System.out.println("Stack is empty");
        }
        st.pop();
        
    }
    
    public int top() {
         if(st.empty())
        {
            System.out.println("Stack is empty");
        }
        return st.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int num:st)
        {
            if(num<min)
            {
                min=num;
            }
        }
        return min;
    }
}