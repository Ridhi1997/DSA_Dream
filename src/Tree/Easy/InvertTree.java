package Tree.Easy;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);

        System.out.println(invertTree(node));


    }
    public  static  TreeNode invertTree(TreeNode root){
        if( root == null) return null;
        TreeNode node = new TreeNode(root.data);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;

    }
    public  static  void  preOrder(TreeNode root){
        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
