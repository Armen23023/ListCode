package org.example.RemoveNthNodeFromEndOfList19;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RNNFEOL19 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3
                , new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8,
                new ListNode(9, new ListNode(10)))))))))), 7);

    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;

        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;

        return head;

    }
}