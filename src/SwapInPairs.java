public class SwapInPairs {

    /**
     * Definition for singly-linked list.
     */
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    //1->2->3->4
    // result 2->1->4->3
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null){
                return head;
            }
            if(head.next == null){
                return head;
            }

            ListNode priorHead = head; //1
            head = priorHead.next; //2
            priorHead.next = swapPairs(head.next);
            head.next = priorHead; //2-1
            return head;
        }
    }
}
