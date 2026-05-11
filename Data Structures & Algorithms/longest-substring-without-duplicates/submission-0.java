class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
       int  maxlength=0;

        char[] c=s.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        while(j<c.length)
        {
            if(!hs.contains(c[j]))
            {
                hs.add(c[j]);
                j++;
               int  count=j-i;
               maxlength=Math.max(maxlength,count);
            }
            else 
            {
                hs.remove(c[i]);
                i++;

            }
        }
        
        return maxlength;
    }
}
