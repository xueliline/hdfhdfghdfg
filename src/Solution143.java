import java.util.ArrayList;
import java.util.List;

public class Solution143 {
    public void reorderList(ListNode head) {
        List<ListNode> list=new ArrayList<>();
        int count=0;
        while (head!=null)
        {
            list.add(head);
            head=head.next;
            count++;
        }
        ListNode pre;
        for (int i=0;i<(count+1)/2;i++)
        {
            list.get(i).next=list.get(count-1-i);
            list.get(count-1-i).next=list.get(i+1);
        }
        list.get((count+1)/2-1).next=null;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        Solution143 solution143=new Solution143();
        solution143.reorderList(l1);

    }
}
