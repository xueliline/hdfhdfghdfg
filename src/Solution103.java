import java.util.ArrayList;
import java.util.List;

public class Solution103 {
    public List<List<Integer>> lists;
    public  void cc(TreeNode root,int height)
    {
        if(root==null)
            return;

        if(height > lists.size() - 1){
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }

        cc(root.right,height+1);
        if(height%2==0) {
            lists.get(height).add(0, root.val);
        }else {
            lists.get(height).add(root.val);
        }
        cc(root.left,height+1);

    }
    public List<Double> averageOfLevels(TreeNode root)  {
        lists =new ArrayList<>();
        cc(root,0);
        double avage=0;
        List<Double> result=new ArrayList<>();
        for (List<Integer> list:lists)
        {
            avage=0;
          for (Integer i:list)
          {
              avage+=i;
          }
          result.add( (avage/(double) list.size()));
        }
         return result;
    }
}


//    public static void main(String[] args) {
//        TreeNode t1=new TreeNode(3);
//        TreeNode t2=new TreeNode(9);
//        TreeNode t3=new TreeNode(20);
//        TreeNode t4=new TreeNode(15);
//        TreeNode t5=new TreeNode(7);
//        t1.left=t2;
//        t1.right=t3;
//        t3.left=t4;
//        t3.right=t5;
//        Solution103 solution103=new Solution103();
//        List<Double> lists=solution103.averageOfLevels(t1);
//    }