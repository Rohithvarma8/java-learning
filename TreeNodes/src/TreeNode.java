import java.util.List;

public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    public TreeNode(){
        //default Constructor
    }
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void preOrderTraversal(TreeNode root, List<Integer> list){
        list.add(root.val);
        if(root.left != null){
            preOrderTraversal(root.left,list);
        }
        if(root.right != null) {
            preOrderTraversal(root.right, list);
        }
        return;
    }

    public void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left,list);
        list.add(root.val);
        inOrderTraversal(root.right,list);
    }
    public void postOrderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left,list);
        postOrderTraversal(root.right,list);
        list.add(root.val);
    }
}
