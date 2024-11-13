package org.example.RemoveLinkedListElement203;

public class RLLE203 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        solution.removeElements(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(6)))))), 6);
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
            while(head != null && head.val == val){
                head = head.next;
            }

            ListNode cur = head;

            if(cur == null) return head;
            if(cur.next == null) return head;

            while(cur.next != null){
                if(cur.next.val == val){
                    if(cur.next.next == null){
                        cur.next = null;
                        break;
                    }else{
                        cur.next = cur.next.next;
                        continue;
                    }
                }
                cur = cur.next;
            }
            return head;
        }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }