import java.util.ArrayList;
import java.util.List;

public class Solution230{
    List<Integer> list=new ArrayList<>();
    public  void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k);
    }
}

