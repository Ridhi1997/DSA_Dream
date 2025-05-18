package Tree.Trees;
//LRN
public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        postorder(root);
    }
    public static  void  postorder(TreeNode root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
