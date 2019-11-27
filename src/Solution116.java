import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution116 {
    public Node connect(Node root) {
        List<List<Node>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty()) {
            int count = queue.size();
            List<Node> list1 = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                Node cur = queue.poll();
                if (cur.left != null)
                    list1.add(cur.left);
                if (cur.right != null)
                    list1.add(cur.right);
            }
            list.add(list1);
        }
        for (int i = 0; i < list.size(); i++) {
            List<Node> curlist = list.get(i);
            Node cur = curlist.get(0);
            for (int j = 1; j < curlist.size(); j++)
            {
                cur.next = curlist.get(j);
                cur = curlist.get(j);
            }
        }
        return root;
    }
}