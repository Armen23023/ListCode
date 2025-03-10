package org.example.MergeTwoSortedList21;

public class MTSL21 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.mergeTwoLists(new ListNode(1,new ListNode(2,new ListNode(4))), new ListNode(1,new ListNode(3,new ListNode(4))));
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var first = list1;
        var second = list2;
        ListNode list = new ListNode();
        var ret = list;

        while(first != null && second != null) {
            if(first.val < second.val) {
                list.next = first;
                first = first.next;
            }else{
                list.next = second;
                second = second.next;
            }
            list = list.next;
        }
        if(first == null){
            list.next = second;
        }
        if(second == null){
            list.next = first;
        }

        return ret.next;
    }
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }