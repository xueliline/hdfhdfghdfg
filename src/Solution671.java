import java.util.Arrays;
import java.util.HashMap;

public class Solution671 {
    HashMap<Integer,Integer> map=new HashMap<>();
    public void pre(TreeNode root)
    {
        if(root==null)
            return ;
        if(!map.containsKey(root.val))
        map.put(root.val,1);
        pre(root.left);
        pre(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
            return  -1;
        pre(root);
        int []res=new int[map.size()];
        int count=0;
        for (Integer key:map.keySet())
        {
            res[count++]=key;
        }
         Arrays.sort(res);
        if(2>count)
            return -1;
        return res[1];
    }
}