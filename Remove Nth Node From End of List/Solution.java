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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            head = null;
            return head;
        }

        // Find size of list
        ListNode cur rNode = head;
        int size = 0;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }

        // only two elment
        if(n == size){
            return head.next;
        }

        // nth node from last = (size - n +1)th node from start
        // ListNode reqNode = head;
        // int IdxToSearch = size - n + 1;
        // while(n != size-n+1){
        //  
        //     reqNode = reqNode.next;
        // }



        // prevNode of the nth(reqNode) node
        ListNode prevNode = head;
        int prevIdx = size - n;
        int i=1;
        while(i < prevIdx){
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;

        return head;
        
    }
}
