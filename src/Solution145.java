import java.util.ArrayList;
import java.util.List;

public class Solution145 {
    List<Integer> list=new ArrayList<>();
    public  void postorder(TreeNode root)
    {
        if(root==null)
            return ;
        postorder(root.left);
        list.add(root.val);
        postorder(root.right);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }
}