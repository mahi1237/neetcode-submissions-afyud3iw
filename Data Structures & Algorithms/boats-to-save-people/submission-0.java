class Solution {
    public int numRescueBoats(int[] people, int limit) {
     int n=people.length;
       int i=0;
       int j=n-1;
       int count =0;
       Arrays.sort(people);
     while(i<=j)
     {
        int sum=people[i]+people[j];
         if(sum<=limit)
         {
            
            i++;
         }
         j--;
         count++;
         
     }
     return count;
     

        
    }
}