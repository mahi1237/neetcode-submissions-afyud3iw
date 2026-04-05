class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
            String[] paths = path.split("/");
            for(String cur:paths)
            {
                if(cur.equals(".."))
                {
                    if(!st.empty())
                    {
                        st.pop();
                    }
                }
                else if(!cur.equals("")&& !cur.equals("."))
                {
                    st.push(cur);
                }
            }
        return "/"+String.join("/",st);
    }
}