public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode pre = prehead;
        ListNode cur = prehead.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur=cur.next;
                continue;
            }
            pre = cur;
            cur = cur.next;
        }
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(1);
        listNode.next=listNode1;
        Solution203 solution203=new Solution203();
        ListNode res=solution203.removeElements(listNode,1);
    }
}