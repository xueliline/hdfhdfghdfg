public class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode newhead = new ListNode(-1);
        ListNode pre=newhead;
        ListNode cur;
        while (head != null) {
            pre =newhead;
            cur = newhead.next;
            while (cur != null) {
                if (head.val > cur.val) {
                    pre=cur;
                    cur = cur.next;
                } else {
                    break;
                }
            }
             ListNode tmp=new ListNode(head.val);
            pre.next=tmp;
            tmp.next=cur;
            head = head.next;
        }
        return newhead.next;
    }
}

//    public static void main(String[] args) {
//        ListNode l1=new ListNode(4);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(1);
//        ListNode l4=new ListNode(3);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        Solution147 solution147=new Solution147();
//        ListNode res=solution147.insertionSortList(l1);
//    }