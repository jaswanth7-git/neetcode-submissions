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
        //we basically renove (l-n)th node where l is length of th linked list
        ListNode start = head;
        int l = 0;
        while(start != null){
            l++;
            start = start.next;
        }
        if(l==1 && n==1) return null;
        int nodeRemovalIndex = l-n+1;
        if(nodeRemovalIndex == 1){
            return head.next;
        }
        start = head;
        for(int i=1;i<=nodeRemovalIndex;i++){
            if(i==(nodeRemovalIndex-1) && (start.next != null)){
                start.next = start.next.next;
                break;
            }
            start = start.next;
        }
        return head;

    }
}
