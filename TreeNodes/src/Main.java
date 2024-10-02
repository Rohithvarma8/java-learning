import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);
        List<Integer> list = new ArrayList<>();
        tree.preOrderTraversal(tree,list);
        List<Integer> inorderList = new ArrayList<>();
        tree.inOrderTraversal(tree,inorderList);
        List<Integer> postorderList = new ArrayList<>();
        tree.postOrderTraversal(tree,postorderList);
        System.out.println(list);
        System.out.println(inorderList);
        System.out.println(postorderList);
    }
}