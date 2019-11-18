import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists=new ArrayList<>();
        if(root==null)
            return null;
                    List<Integer> list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            list=new ArrayList<>();
            for (int i=0;i<count;i++){
                TreeNode tmp=queue.poll();
                if(tmp.left!=null)
                    queue.add(tmp.left);
                if(tmp.right!=null)
                    queue.add(tmp.right);
                list.add(tmp.val);
            }
            lists.add(list);
        }
        return lists;
    }
}