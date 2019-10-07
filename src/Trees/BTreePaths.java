package Trees;

import java.util.ArrayList;
import java.util.List;

public class BTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null)
            return paths;
        depthFirstSearch(root, "", paths);
        return paths;
    }

    public void depthFirstSearch(TreeNode root, String path, List<String> paths){
        path += root.val;
        // If the root is the leaf
        if(root.left == null && root.right == null) {
            paths.add(path);
            return;
        }
        if(root.left != null){
            depthFirstSearch(root.left, path + "->", paths);
        }
        if(root.right != null){
            depthFirstSearch(root.right, path + "->", paths);
        }
    }


}
