public class Solution125 {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase().trim();
        int i,j;
        i=0;
        j=s1.length()-1;
        while (i<j)
        {
            if(!((s1.charAt(i)<='z'&&s1.charAt(i)>='a')||(s1.charAt(i)<='9'&&s1.charAt(i)>='0')))
            {
                i++;
                continue;
            }
            if(!((s1.charAt(j)<='z'&&s1.charAt(j)>='a')||(s1.charAt(j)<='9'&&s1.charAt(j)>='0')))
            {
                j--;
                continue;
            }
            if(s1.charAt(i)!=s1.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution125 solution125=new Solution125();
        solution125.isPalindrome("ab2a");
    }
}