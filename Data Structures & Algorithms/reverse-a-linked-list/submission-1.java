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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        ListNode temp1 = temp.next;
        ListNode temp2 = temp1.next;
        temp.next = null;

        while(temp1 != null){  
            temp1.next = temp;
            temp = temp1;
            temp1 = temp2;
            if(temp2 != null){
                temp2 = temp2.next;
            }   
        }
        

        
        return temp;
    }
}
