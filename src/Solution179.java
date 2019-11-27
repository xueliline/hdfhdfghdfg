import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class Solution179 {
    public String largestNumber(int[] nums) {
        class Tmp implements Comparable <Tmp>{
            public int getNum() {
                return num;
            }
            public void setNum(int num) {
                this.num = num;
            }
            public String getRes() {
                return res;
            }

            public void setRes(String res) {
                this.res = res;
            }
            public int getLen() {
                return len;
            }
            public void setLen(int len) {
                this.len = len;
            }
            int num;
            String res;
            int len;
            @Override
            public int compareTo(Tmp o) {
                if(this.num==o.num)
                    return o.len-this.len;
                    return this.num-o.num;
            }
            Tmp(int num,int len,String string)
            {
                this.res=string;
                this.len=len;
                this.num=num;
            }
        }
        String[] res = new String[nums.length];
        int maxlen = 0;
      Tmp [] tmps=new Tmp[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
            if (res[i].length() > maxlen)
                maxlen = res[i].length();
        }

        for (int i = 0; i < nums.length; i++) {
            if(maxlen!=res[i].length())
            {
                nums[i] = (int) (nums[i] * Math.pow(10, maxlen - res[i].length())+9);
            }
            else {
                nums[i] = (int) (nums[i] * Math.pow(10, maxlen - res[i].length()));
            }
            tmps[i]=new Tmp(nums[i],res[i].length(),res[i]);
        }
      StringBuilder stringBuilder=new StringBuilder();
        Arrays.sort(tmps);
        Long  val1;
        long val2;
        Stack<String> stack=new Stack<>();
        stack.push(tmps[nums.length-1].res);
        for (int i=nums.length-2;i>=0;i--)
        {
            val1=Long.valueOf(stack.peek()+tmps[i].res);
            val2=Long.valueOf(tmps[i].res+stack.peek());
            if(val1>val2)
            {
                stack.push(tmps[i].res);
            }else {
                String tmp=stack.pop();
                stack.push(tmps[i].res);
                stack.push(tmp);
            }

        }
        Stack<String > stack1=new Stack();
        while (!stack.isEmpty())
        {
            String tt=stack.pop();
            stack1.add(tt);

        }
        while (!stack1.isEmpty())
        {
            stringBuilder.append(stack1.pop());
        }
        String res2 =stringBuilder.toString();
        int z;
        for ( z=0;z<res2.length();z++)
        {
            if(res2.charAt(z)!='0')
                break;
        }
        if(z==res2.length())
            return"0";
        return res2.substring(z);
    }
        public static void main(String[] args) {
        Solution179 solution179 = new Solution179();
        String s = solution179.largestNumber(new int[]{0,0});
    }
}

