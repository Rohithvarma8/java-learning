import java.util.ArrayList;
import java.util.List;

public class Node {
    int num;
    Node next;
    public Node(int num, Node next){
        this.num = num;
        this.next = next;
    }
    public Node(int num){
        this.num = num;
        this.next = null;
    }
}
class LinkedL {
    public static int noOfNodes(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static Node ll(int[] nums, int k) {
        Node node = new Node(nums[0]);
        Node head = node;
        Node mover = head;
        for (int i = 1; i < k; i++) {
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printAllNodes (Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.num + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static List <Integer> searchNode(Node head, int target){
        List <Integer> list = new ArrayList<>();
        Node temp = head;
        int count = 0;
        while(temp != null){
            if (temp.num == target){
                list.add(count);
            }
            temp = temp.next;
            count++;
        }
        return list;
    }
    public static Node deleteNode(Node head, int k){
        Node temp = head;
        int count = 0;
        if (head == null){
            return null;
        }
        if (head.next == null){
            if(k==1) return null;
            else return head;
        }
        if (k == 1){
            head = head.next;
            return head;
        }
        while(temp.next != null){
            count++;
            if (count == k-1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public  static Node insertNode (Node head, int pos, int val){
        if(head == null && pos == 1) return new Node(val);
        if (pos == 1) {
            return new Node(val, head);
        }
        Node mover = head;
        Node tail = head;
        int len = noOfNodes(head);

        int count = 0;
        while (mover  != null){
            count++;
            if (count == pos - 1){
                Node temp = new Node(val,mover.next);
                mover.next = temp;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

}