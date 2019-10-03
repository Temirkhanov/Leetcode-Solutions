package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> currentLvl = new ArrayList<>();
            for(int i = 0; i < queue.size(); i++){
                TreeNode curr = queue.remove();
                currentLvl.add(curr.val);
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            } // for
            result.add(currentLvl);
        } // while
        return result;
    }

}
