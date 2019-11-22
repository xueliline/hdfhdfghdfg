import java.util.Stack;

public class Solution402 {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        int i = 1;
        for (; i < num.length(); i++) {
            if (k == 0) {
                stack.push(num.charAt(i));
                continue;
            }
            if (stack.peek() < num.charAt(i)) {
                k--;
                continue;
            } else if (stack.peek() > num.charAt(i)) {
                k--;
                stack.pop();
                stack.push(num.charAt(i));
            } else if (stack.peek() == num.charAt(i)) {
                stack.push(num.charAt(i));
            }
        }
        for (int z = 0; z < k; z++) {
            stack.pop();
        }
        if (stack.isEmpty())
            return "0";
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        String result = builder.reverse().toString();
        int j = 0;
        for (; j < result.length(); j++) {
            if (result.charAt(j) != '0') {
                break;
            }
        }
        if (j == result.length())
            return "0";
        result = result.substring(j);
        return result;
    }


}
//    public static void main(String[] args) {
//        Solution402 solution402=new Solution402();
//        String res=solution402.removeKdigits("112",1);
//    }