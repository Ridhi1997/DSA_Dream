package Tree.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        //root = [3,9,20,null,null,15,7]
        TreeNode node = new TreeNode(3);
         node.left = new TreeNode(9);
         node.right = new TreeNode(20);
         node.right.left = new TreeNode(15);
         node.right.right = new TreeNode(7);
         System.out.println(maxDepth(node));
        System.out.println(maxDepth1(node));


    }
    /*
      Approach 1) Recursive DFS
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {return  0;}
        else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            int  maxDepthValue = Math.max(left_height,right_height)+1;
            return maxDepthValue;
        }
    }
/*
  Approach : Using BFS(Breadth first search)
 */
    public static int maxDepth1(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null){
            q.add(root);
        }
        int level =0;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
            level++;
        }
        return level;

    }
}
