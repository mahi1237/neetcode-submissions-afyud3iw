/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);   
            temp = temp.next;
        }
  ArrayList<Integer> newList = new ArrayList<>();  // FIX

    int i=0;
    int j=list.size()-1;
    while(i<=j){
       newList.add(list.get(i));
       if(i!=j)
       {
       newList.add(list.get(j));
       }
       i++;

       j--;
    }
        temp = head;
        int k = 0;
        while (temp != null) {
            temp.val = newList.get(k++);
            temp = temp.next;    
        
    }
}
}
