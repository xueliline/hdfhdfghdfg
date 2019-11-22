import java.util.ArrayList;
import java.util.List;

public class Solution144 {
    List<Integer> list=new ArrayList<>();
    public  void preorder(TreeNode root)
    {
        if(root==null)
            return ;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
         return list;
    }
}