/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution530 {
    public int min = Integer.MAX_VALUE;
    public TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);

        if (pre != null) {
            min = Math.min(min, Math.abs(root.val - pre.val));
        }
        pre = root;
        inOrder(root.right);
    }
}

//    public static void main(String[] args) {
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(8);
//        TreeNode t3=new TreeNode(3);
//        t1.right=t2;
//        t2.left=t3;
//        Solution530 solution530=new Solution530();
//        int res=solution530.getMinimumDifference(t1);
//        System.out.println(res);
//    }