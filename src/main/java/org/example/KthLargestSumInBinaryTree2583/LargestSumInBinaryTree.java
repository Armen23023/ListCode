package org.example.KthLargestSumInBinaryTree2583;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class LargestSumInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.kthLargestLevelSum(new TreeNode(5
                , new TreeNode(8,
                new TreeNode(2
                        , new TreeNode(4), new TreeNode(6)),
                new TreeNode(1))
                , new TreeNode(9,
                new TreeNode(3), new TreeNode(7))), 2);
    }
}

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> sq = new ArrayDeque<>();
        sq.add(root);
        Map<Integer, Integer> map = new HashMap<>();
        int i = 1;


        while (!sq.isEmpty()) {
        int size = sq.size();
            int sum = 0;
            for (int j = 0; j < size; j++) {
                TreeNode curr = sq.poll();
                sum += curr.val;

                if (curr.left != null) {
                    sq.add(curr.left);
                }

                if (curr.right != null) {
                    sq.add(curr.right);
                }
            }
            map.put(i, sum);
            i++;
        }


        return map.get(k);

    }


}
