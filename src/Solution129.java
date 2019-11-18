class Solution129 {
    public int sumNumbers(TreeNode root) {
        return preOrder(root,0);
    }
    public int   preOrder(TreeNode root,int res)
    {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return res+root.val;
        int res1=preOrder(root.right,(res+root.val)*10);
        int res2=preOrder(root.left,(res+root.val)*10);
        return res1+res2;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t3=new TreeNode(5);

        t1.right=t3;
        Solution129 solution129=new Solution129();
        int res=solution129.sumNumbers(t1);
        System.out.println(res);
    }
}