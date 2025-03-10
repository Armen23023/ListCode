package org.example.LinkedListCycle141;

public class LLC141 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.hasCycle(new ListNode(1));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


 class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null) return false;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null){
            if(second == first) return true;
            first = first.next;
            if(second.next == null) return false;
            second = second.next.next;
        }
        return false;
    }
}
