import java.util.ArrayList;
import java.util.List;

public class Solution563 {
    List<Integer> list=new ArrayList<>();
    public  int   sum(TreeNode root)
    {
        if(root==null)
            return 0;
        int sum1=sum(root.left);
        int sum2=sum(root.right);
        list.add(Math.abs(sum1-sum2));
        return sum1+sum2+root.val;
    }
    public int findTilt(TreeNode root) {
        int sum=0;
        sum(root);
        for (Integer i:list){
            sum+=i;
        }
        return sum;
    }
}


//    public static void main(String[] args) {
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(3);
//        t1.left=t2;
//        t1.right=t3;
//        Solution563 solution563=new Solution563();
//        int res=solution563.findTilt(t1);
//    }