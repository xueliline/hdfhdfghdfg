class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null&&p==null)
            return true;
        if(p==null&&q!=null)
            return false;
        if(q==null&&p!=null)
            return false;
        if(p.val==q.val)
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        if(p.val!=q.val)
            return false;
        return true;
    }
}