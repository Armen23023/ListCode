package org.example.SameTree100;


import java.util.LinkedList;
import java.util.Queue;

public class ST4100 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isSameTree(new TreeNode(1,new TreeNode(2),null), new TreeNode(1,null,new TreeNode(2)));
    }
}

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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        Queue<TreeNode> queue1 = new LinkedList();
        queue1.add(p);

        Queue<TreeNode> queue2 = new LinkedList();
        queue2.add(q);

        while(!queue1.isEmpty()){

            int size = queue1.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue1.poll();
                TreeNode node2 = queue2.poll();
                if(node == null || node2 == null || node.val != node2.val){
                    return false;
                }

                if(node.left != null || node2.left != null){
                    queue1.add(node.left);
                    queue2.add(node2.left);
                }

                if(node.right != null || node2.right != null){
                    queue1.add(node.right);
                    queue2.add(node2.right);
                }
            }
        }
        return true;
    }
}