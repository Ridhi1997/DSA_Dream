package Tree.Easy;

public class SameBinaryTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(isSameTree(p,q));


    }
    /*
       Approach : using DFS;
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)  return  true;
        if (p != null && q != null && p.data == q.data){
            return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return  false;
        }
    }
}
