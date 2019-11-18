import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution114 {
    TreeNode pre = null;
    Queue<TreeNode> queue = new LinkedList<>();
    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        queue.add(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void flatten(TreeNode root) {
        if(root==null)
            return ;
        preOrder(root);
        TreeNode cur = null;
        TreeNode pre = queue.poll();
        pre.right = null;
        pre.left = null;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            cur.right = null;
            cur.left = null;
            pre.right = cur;
            pre=cur;
        }
    }




    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        Solution114 solution114 = new Solution114();
        solution114.flatten(t1);
    }
}
