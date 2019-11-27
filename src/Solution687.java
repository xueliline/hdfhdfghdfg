public class Solution687 {
    int maxlen = 0;

    public int longestUnivaluePath1(TreeNode root) {
        if (root == null)
            return 0;
        int len1 = 0;
        int len2 = 0;
        if (root.left != null) {
            len1 = longestUnivaluePath1(root.left);
            if (root.val == root.left.val) {
                len1 = len1 + 1;
            } else {
                len1 = 0;
            }
        }
        if (root.right != null) {
            len2 = longestUnivaluePath1(root.right);
            if (root.val == root.right.val) {
                len2 = len2 + 1;
            } else {
                len2 = 0;
            }
        }
        int res = Math.max(len1, len2);
        maxlen = Math.max(res, maxlen);
        if(root.left!=null&&root.right!=null) {
            if (root.val == root.right.val && root.val == root.left.val) {
                maxlen = Math.max(maxlen, len1 + len2);
            }
        }
        return res;
    }

    public int longestUnivaluePath(TreeNode root) {
        longestUnivaluePath1(root);
        return maxlen;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = null;
        t3.right = t6;
        Solution687 solution687 = new Solution687();
       int len= solution687.longestUnivaluePath(t1);
    }
}