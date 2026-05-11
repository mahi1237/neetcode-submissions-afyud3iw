class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                 int l=i+1;
                 int r=j;
                 boolean leftvalid=true;
                 while(l<r)
                 {
                    if(s.charAt(l)!=s.charAt(r))
                    {
                        leftvalid=false;

                    }
                  l++;
                  r--;
                 }
                  l=i;
                 r=j-1;
                 boolean rightvalid=true;
                 while(l<r)
                 {
                    if(s.charAt(l)!=s.charAt(r))
                    {
                        rightvalid=false;

                    }
                  l++;
                  r--;
                 }
return rightvalid||leftvalid;

            }
        }
        return true;
        
    }
    

}