import java.util.List;

public class Main {

    public static void main(String[] args) {
            int [] arr = new int[] {2,3,4,5,6,6,7};
            Node head = LinkedL.ll(arr, arr.length);
            LinkedL.printAllNodes(head);
            int len = LinkedL.noOfNodes(head);
            System.out.println(len);
            List<Integer> list = LinkedL.searchNode(head,6);
            System.out.println(list);
            head = LinkedL.deleteNode(head,2);
            LinkedL.printAllNodes(head);
            head = LinkedL.insertNode(head,7,5);
            LinkedL.printAllNodes(head);


    }
}