public class Solution67 {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int len = Math.min(len1, len2);
        StringBuilder builder = new StringBuilder();
        int c = 0;
        int i ;
        int j;
        int k ;
        for ( i=len1 - 1, j = len2 - 1, k=0; k < len; k++,j--,i--) {
            int tmp = ((a.charAt(i) - '0') + (b.charAt(j) - '0') + c);
            builder.append(tmp % 2);
            c = tmp / 2;
        }
        for (; i >=0; i--) {
            int tmp = (a.charAt(i) -'0'+ c);

            builder.append(tmp % 2);
            c = tmp / 2;
        }
        for (; j >=0 ; j--) {
            int tmp = (b.charAt(j)-'0' + c);

            builder.append(tmp % 2);
            c = tmp / 2;
        }
        if(c==1)
            builder.append(c);
        return builder.reverse().toString();
    }
}
//    public static void main(String[] args) {
//        Solution67 solution67=new Solution67();
//        String res=solution67.addBinary("11","1");
//    }