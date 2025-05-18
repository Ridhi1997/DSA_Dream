package Tree.Easy;

public class SubtreeofAnotherTree {
    public static void main(String[] args) {
//root = [3,4,5,1,2], subRoot = [4,1,2]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        System.out.println(isSubtree(root,subRoot));
    }

    /*
       Approach : Using DFS
     */
    public  static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null ) return  false;
        if (subRoot == null) return  true;
        if (sameTree(root,subRoot)) return  true;
        return  isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
    public  static  boolean sameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return  true;

        if (p != null && q != null && p.data == q.data){
            return  sameTree(p.left,q.left) && sameTree(p.right,q.right);
        }else {
            return  false;
        }
    }
}
