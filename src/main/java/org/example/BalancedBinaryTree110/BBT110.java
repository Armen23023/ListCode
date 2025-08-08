package org.example.BalancedBinaryTree110;


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


public class BBT110 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4),new TreeNode(4)),new TreeNode(3)),new TreeNode(2)));
        System.out.println(balanced);
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        else{
            int left = getMaxHeight(root.left);
            int right = getMaxHeight(root.right);
            return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);

        }
    }

    private int getMaxHeight(TreeNode node){
        if(node == null) return 0;
        else return 1 + Math.max(getMaxHeight(node.left) , getMaxHeight(node.right));
    }
}
