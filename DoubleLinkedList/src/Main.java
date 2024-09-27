//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr =  new int[]{1,1,2,3,5,6};
        // array of numbers
        // convert into double linked list
        // 1000000
        // list
        //linked list two single :- node : val next node address;
        // double linked  list prev , next;
        // head is pointing on  first element of linked list
        Node head =  DoubleLL.dll(arr);
        DoubleLL.printNode(head);
        int count = DoubleLL.noOfNodes(head);
        System.out.println("size of double linkedLst is : "+count);
        head = DoubleLL.addNode(head,2,4);
        DoubleLL.printNode(head);
        head = DoubleLL.addNode(head,1,0);
        DoubleLL.printNode(head);
        head = DoubleLL.addNode(head,9,4);
        DoubleLL.printNode(head);
        head = DoubleLL.deleteNode(head,1);
        DoubleLL.printNode(head);
        head = DoubleLL.deleteNode(head,4);
        DoubleLL.printNode(head);
        head = DoubleLL.deleteNode(head,7);
        DoubleLL.printNode(head);
        // linked lists ??
        // double linked list
    }
}