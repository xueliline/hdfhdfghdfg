import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution46 {
    List<List<Integer>> lists = new ArrayList<>();
    boolean visted[];

    private void order(Stack stack, int[] nums, int k, int len) {
        if (k == len) {
            lists.add(new ArrayList<>(stack));
            return ;
        }
        for (int i = 0; i < len; i++) {
            if(visted[i]==false) {
                stack.push(nums[i]);
                visted[i] = true;
                order(stack, nums, k+1, len);
                visted[i] = false;
                stack.pop();
            }
        }
        return ;
    }

    public List<List<Integer>> permute(int[] nums) {
        visted = new boolean[nums.length];
        Stack stack=new Stack();
        order(stack,nums,0,nums.length);
        return lists;
    }

    public static void main(String[] args) {
        Solution46 solution46=new Solution46();
        solution46.permute(new int[]{1,2,3,4});
    }
}
