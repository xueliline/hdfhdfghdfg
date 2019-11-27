import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution77 {
    List<List<Integer>> lists = new ArrayList<>();

    private void order(Stack<Integer> stack, int start, int k, int n) {
        if (k == 0) {
            lists.add(new ArrayList<>(stack));
            return;
        }
        for (int i = start; i <= n; i++) {
            stack.push(i);
            order(stack, i+1, k-1, n);
            stack.pop();
        }
        return;
    }

    public List<List<Integer>> combine(int n, int k) {
        Stack<Integer> stack = new Stack<>();
        order(stack, 1, k, n);
        return lists;
    }

    public static void main(String[] args) {
        Solution77 solution77=new Solution77();
        solution77.combine(4,2);
    }
}
