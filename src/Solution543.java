import java.util.ArrayList;
import java.util.List;

public class Solution543 {
    List<Integer> list = new ArrayList<>();

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int height1 = height(root.left);
        int height2 = height(root.right);
        int height = height1 + height2 ;
        list.add(height);
        return Math.max(height1, height2) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        height(root);
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (max < i)
                max = i;
        }
        return max+1;
    }
}
//public static void main(String[] args) {
//    TreeNode t1=new TreeNode(1);
//    TreeNode t2=new TreeNode(2);
//    TreeNode t3=new TreeNode(3);
//    TreeNode t4=new TreeNode(4);
//    TreeNode t5=new TreeNode(5);
//    t1.left=t2;
//    t1.right=t3;
//    t2.left=t4;
//    t2.right=t5;
//    Solution543 solution543=new Solution543();
//    int lists=solution543.diameterOfBinaryTree(t1);
//}
