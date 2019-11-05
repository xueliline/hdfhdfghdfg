import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null)
        {
        if(set.contains(head))
        {
            return true;
        }else{
            set.add(head);
            head=head.next;

        }
        }
        return false;
    }
}