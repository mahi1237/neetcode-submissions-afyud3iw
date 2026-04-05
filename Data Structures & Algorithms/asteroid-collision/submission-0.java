class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids)
        {
            while(!st.empty()&&a<0&& st.peek()>0)
            {
                if(Math.abs(a)>st.peek())
                {
                    st.pop();
                }
                else if (Math.abs(a)==st.peek())
                {
                    st.pop();
                    a=0;
                }
                else {
                    a=0;
                }
            }
       if(a!=0) st.push(a);
    }
    return st.stream().mapToInt(i -> i).toArray();
    }
    
}

