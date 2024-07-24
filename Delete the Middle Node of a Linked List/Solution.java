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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            head = null;
            return head;
        }

        // size of list
        ListNode currNode = head;
        int size = 0;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }


        int mid = size/2;

        // prevNode of mid 
        int i=0;
        int prevIdx = (size/2) - 1;
        ListNode prevNode = head;
        while(i<prevIdx){
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
        return head;
        
    }
}
