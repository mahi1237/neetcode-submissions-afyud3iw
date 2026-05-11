class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            
        
             if(operations[i].equals("+"))
           {
              int top=st.pop();//2
              int top2=st.peek();//1
              int newTop=top+top2;//3
              st.push(top);// 2
              st.push(newTop);//3
           }
           else if(operations[i].equals("C"))
           {
            st.pop();// it will pop the item
           }
           else if(operations[i].equals("D"))
           {
            st.push(2*st.peek());
           }
           else{
           st.push(Integer.parseInt(operations[i]));
           }
        }
       int sum = 0;
for (int val : st) {
    sum += val;
}
return sum;
    }
}