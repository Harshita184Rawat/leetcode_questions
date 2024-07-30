/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // not removing/deleting the given node

    // 4->5->6->7
    // 4->6->6->7
    

    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;

        node.next = temp.next;
        temp.next = null;
         
    }
}
