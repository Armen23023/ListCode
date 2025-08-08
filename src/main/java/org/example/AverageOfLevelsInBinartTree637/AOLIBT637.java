package org.example.AverageOfLevelsInBinartTree637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AOLIBT637 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Double> doubles = solution.averageOfLevels(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(doubles);

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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Double> retList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            retList.add(sum/size);
        }

        return retList;
    }
}
