package Trees;

public class ValidBST {

    public boolean isValidBST(TreeNode root) {
        return validBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public boolean validBST(TreeNode p, double min, double max){
        if(p==null)
            return true;
        if(p.val <= min || p.val >= max)
            return false;
        return (validBST(p.left, min, p.val) && validBST(p.right, p.val, max));
    }
}