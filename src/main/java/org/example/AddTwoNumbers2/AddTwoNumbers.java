package org.example.AddTwoNumbers2;



class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addTwoNumbers(new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))),new ListNode(9
        ,new ListNode(9,new ListNode(9,new ListNode(9)))));
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);

         TwoNumbers(l1, l2, cur);

        return cur;
    }

    ListNode TwoNumbers(ListNode l1, ListNode l2,ListNode cur) {
        int next = 0;
        int current = 0;
        if (l1 != null && l2 != null) {
            if (cur == null) {
                cur = new ListNode(0);
            }
            current = l1.val + l2.val + cur.val;

            if (current > 9) {
                next = current%10;
                cur.val =  next;
                cur.next = new ListNode(current/10);
                TwoNumbers(l1.next, l2.next, cur.next);
            }else {
                cur.val = cur.val + current;
                if(l1.next != null || l2.next != null){
                    cur.next = new ListNode(0);
                }
                TwoNumbers(l1.next, l2.next, cur.next);
            }
        }

        if(l1 == null && l2 != null) {
            current = l2.val + cur.val;
            if(current > 9){
                next = current%10;
                cur.val =  next;
                cur.next = new ListNode(current/10);
                TwoNumbers(null, l2.next, cur.next);
            }else{
                cur.val = cur.val + current;
                if(l2.next != null ){
                    cur.next = new ListNode(0);
                }
                TwoNumbers(null, l2.next, cur.next);

            }
        }
        if(l1 != null && l2 == null) {
            current = l1.val + cur.val;
            if(current > 9){
                next = current%10;
                cur.val =  next;
                cur.next = new ListNode(current/10);
                TwoNumbers(l1.next, null, cur.next);
            }else{
                cur.val = cur.val + current;
                if(l1.next != null ){
                    cur.next = new ListNode(0);
                }
                TwoNumbers(l1.next, null, cur.next);

            }
        }
        return cur;
    }
}