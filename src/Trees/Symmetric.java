package Trees;

public class Symmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSym(root.left, root.right);
    }

    public boolean isSym(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isSym(left.left, right.right) && isSym(right.left, left.right);
    }

}
