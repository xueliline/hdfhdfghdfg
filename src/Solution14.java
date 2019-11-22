public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0)
                return "";
            min = Math.min(min, strs[i].length());
        }
        if (strs.length == 0)
            return "";
        int i;
        Boolean flag=true;
        for (i = 0; i < min; i++) {
            if(flag==false)
                break;
            char s = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != s) {
                    flag=false;
                    break;
                }
            }
        }
        if(i==0)
            return "";
        if(flag==false)
            i=i-1;
        StringBuilder builder=new StringBuilder();
        for (int z=0;z<i;z++)
            builder.append(strs[0].charAt(z));return builder.toString();
    }
        public static void main(String[] args) {
        Solution14 solution14=new Solution14();
        solution14.longestCommonPrefix(new String[]{"a"});
    }
}
