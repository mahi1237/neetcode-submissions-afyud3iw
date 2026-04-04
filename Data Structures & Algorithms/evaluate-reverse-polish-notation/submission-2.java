class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c:tokens)
        {
            if(c.equals("+"))
            {
                int top1=st.pop();
                int top2=st.pop();
                int newtop=top2+top1;
                st.push(newtop);
            }
           else if(c.equals("*"))
            {
                int top1=st.pop();
                int top2=st.pop();
                int newtop=top2*top1;
                st.push(newtop);
            }
            else if(c.equals("-"))
            {
                int top1=st.pop();
                int top2=st.pop();
                int newtop=top2-top1;
                st.push(newtop);
            }
          else if(c.equals("/"))
            {
                int top1=st.pop();
                int top2=st.pop();
                st.push(top2/top1);
            }
            else{
            st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
        
    }
}
