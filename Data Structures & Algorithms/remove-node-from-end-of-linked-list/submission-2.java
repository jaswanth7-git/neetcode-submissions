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
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        //we created this fake head to handle the edge case of removing head like in case of one element and one element
        ListNode fast = fakeHead;
        ListNode slow = fakeHead;
        for(int i  = 0 ; i < n ; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return fakeHead.next;
    }
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     //we basically renove (l-n)th node where l is length of th linked list
    //     ListNode start = head;
    //     int l = 0;
    //     while(start != null){
    //         l++;
    //         start = start.next;
    //     }
    //     if(l==1 && n==1) return null;
    //     int nodeRemovalIndex = l-n+1;
    //     if(nodeRemovalIndex == 1){
    //         return head.next;
    //     }
    //     start = head;
    //     for(int i=1;i<=nodeRemovalIndex;i++){
    //         if(i==(nodeRemovalIndex-1) && (start.next != null)){
    //             start.next = start.next.next;
    //             break;
    //         }
    //         start = start.next;
    //     }
    //     return head;

    // }
}
