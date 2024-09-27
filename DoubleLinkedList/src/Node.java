public class Node {
    int data;
    Node prev;
    Node next;

    // data 1-9
    // default constructor
    public Node (){

    }
    public Node (int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public Node (int data,Node prev){
        this.data = data;
        this.prev = prev;
        this.next = null;
    }
    public Node (int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLL {
    public static int noOfNodes (Node head){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp =  temp.next;
        }
        return count;
    }
    public static Node addNode (Node head , int pos, int val){
        Node temp = head;
        if (pos == 1){
            Node insertHead = new Node(val);
            insertHead.next = head;
            return insertHead;
        }
        int count = 0;
        while (temp != null){
           count++;
           if (pos == count){
               Node insertNode = new Node(val);
               insertNode.next = temp;
               temp = temp.prev;
               insertNode.prev = temp;
               temp.next = insertNode;
               insertNode = insertNode.next;
               insertNode.prev = temp.next;
           }
           temp = temp.next;
        }
        temp = head;
        count = count+1;
        if (pos == count){
            while(temp != null && temp.next != null){
                temp = temp.next;
            }
            Node insertTail = new Node(val);
            insertTail.prev =  temp;
            temp.next = insertTail;
        }
        return head;
    }
    public static Node deleteNode (Node head, int pos){
        if (head == null || head.next == null) return null;
        Node temp = head;
        if (pos == 1){
            temp = temp.next;
            temp.prev = null;
            return temp;
        }
        int count = 0;
        while (temp != null){
            count++;
            if( pos == count && temp.next != null){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.next = null;
                temp.prev = null;
            }
            else if (pos == count && temp.next == null){
                temp.prev.next = null;
            }
            temp = temp.next;
        }
        return head;

    }
    public static Node dll(int [] nums){
        Node head = new Node(nums[0]);// data : 1; prev : null; next: null
        Node mover = head;
        for(int i = 1; i < nums.length ; i++ ){
            Node temp = new Node(nums[i], mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void printNode (Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
// annotations
// design patterns
//stream api
// multi threading
// spring
// spring boot for creating  backend of an application
// manam we will start learning spring spring boot in end of august


