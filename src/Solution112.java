class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
       if(root.left==null &&root.right==null &&sum==root.val)
           return true;
       if(root.left==null)
           return hasPathSum(root.right,sum-root.val);
       if(root.right==null)
           return  hasPathSum(root.left,sum-root.val);
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }
}