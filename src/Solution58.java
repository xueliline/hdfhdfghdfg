import java.util.ArrayList;
import java.util.List;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        int i;
        for (i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) != ' ') {

              break;
            }
        }
        if(i==-1)
            return 0;
        int j=i;
        for(;j>=0;j--)
        {
            if(s.charAt(j)==' ')
                break;
        }
        return i-j;
    }

    public static void main(String[] args) {
        Solution58 solution58=new Solution58();
        solution58.lengthOfLastWord("hello world ");
    }
}