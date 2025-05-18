package Tree.Medium;

public class LowestCommonAncestorBinarySearchTree {
    public static void main(String[] args) {
//root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
        TreeNode node  = new  TreeNode(6);
        node.left = new  TreeNode(2);
        node.right = new  TreeNode(8);
        node.left.left = new  TreeNode(0);
        node.left.right = new TreeNode(4);
        node.right.left = new   TreeNode(9);
        node.left.right.left = new  TreeNode(3);
        node.left.right.right = new  TreeNode(5);

        TreeNode p = new  TreeNode(2);
         TreeNode q = new  TreeNode(4);
        TreeNode lca = lowestCommonAncestor(node,p,q);
        System.out.println(lca.data);


    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return  null;

        if (Math.max(p.data,q.data) < root.data){
            return  lowestCommonAncestor(root.left,p,q);
        } else if (Math.min(p.data,q.data) > root.data) {
            return  lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }

    }
}
