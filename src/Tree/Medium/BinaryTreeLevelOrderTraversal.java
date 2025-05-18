package Tree.Medium;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(levelOrder(node));
    }
    /*
      Approach : Using DFS
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return res;

    }
    public static void  dfs (TreeNode root , int depth){
        if (root == null) return;

        if (res.size() == depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.data);
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}
