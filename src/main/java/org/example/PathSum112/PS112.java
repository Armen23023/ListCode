package org.example.PathSum112;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PS112 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)
                        )
                )
        ), 22));

        System.out.println(solution.hasPathSum(new TreeNode(1,
                new TreeNode(-2,
                        new TreeNode(1,
                                new TreeNode(-1),
                                null
                        ),
                        new TreeNode(3)
                ),
                new TreeNode(-3,
                        new TreeNode(-2),
                        null
                )
        ), 3));
    }
}


class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null){
            return false;
            }
        int sum = root.val;
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null && !visited.contains(node.left)) {
                sum += node.left.val;
                stack.add(node.left);
                visited.add(node.left);
            } else if (node.right != null && !visited.contains(node.right)) {
                sum += node.right.val;
                stack.add(node.right);
                visited.add(node.right);
            } else {
                if (node.left == null && node.right == null && sum == targetSum) {
                    return true;
                }
                sum -= stack.pop().val;
            }
        }
        return false;
    }

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) return false;
//
//        if (root.left == null && root.right == null) {
//            return root.val == targetSum;
//        }
//
//        return hasPathSum(root.left, targetSum - root.val) ||
//                hasPathSum(root.right, targetSum - root.val);
//    }

}