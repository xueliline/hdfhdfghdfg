import java.util.Stack;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        ListNode listNode1 = headA;
        int len2 = 0;
        ListNode listNode2 = headB;
        while (listNode1 != null) {
            len1++;
            listNode1 = listNode1.next;
        }
        while (listNode2 != null) {
            len2++;
            listNode2 = listNode2.next;
        }
        listNode2 = headB;
        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++) {
                listNode2 = listNode2.next;
            }
        }
        listNode1=headA;
        if (len2 < len1)
            for (int i = 0; i < len1 - len2; i++) {
                listNode1 = listNode1.next;
            }
        while (listNode1 != listNode2) {
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        return listNode1;
    }



}
//public static void main(String[] args) {
//    ListNode l1=new ListNode(1);
//    ListNode l2=new ListNode(2);
//    ListNode l3=new ListNode(3);
//    ListNode l4=new ListNode(4);
//    ListNode l5=new ListNode(5);
//    l1.next=l3;
//    l2.next=l3;
//    l3.next=l4;
//    l4.next=l5;
//    Solution160 solution160=new Solution160();
//    ListNode listNode=solution160.getIntersectionNode(l1,l2);
//    System.out.println("dddddddddddddddddddddddddd");