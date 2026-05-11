class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
        {
            return false;
        }
        int[] a=new int[26];
        int[] b=new int[26];
        for(char c :s1.toCharArray())
        {
            a[c-'a']++;
        }
        int k=s1.length();
        for(int i=0;i<s2.length();i++)
        {
            // expand the window 
           b[s2.charAt(i)-'a']++;
            // shrink the window if the it goes beyound the length
            if(i>=k)
            {
                b[s2.charAt(i-k)-'a']--;

            }
            if(match(a,b)) return true;


        }
        return false;
    }
     public boolean match(int[]a,int[] b)
     {


     for(int j=0;j<26;j++)
     {  
      if(a[j]!=b[j])
      {
        return false;
      }
     }
   return true;
    }

}