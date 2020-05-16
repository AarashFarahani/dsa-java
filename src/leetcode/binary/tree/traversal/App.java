package leetcode.binary.tree.traversal;

import java.util.*;

public class App {
    private final static Integer[] NUM1 = { 1, null, 2, 3 };
    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode tree = buildTree(NUM1);
        new App().preOrderTraversal(tree).forEach(a-> System.out.print(a));
        System.out.println();
        new App().inorderTraversal(tree).forEach(a-> System.out.print(a));
        System.out.println();
        new App().postOrderTraversal(tree).forEach(a-> System.out.print(a));
    }

    private static TreeNode buildTree(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < array.length) {
            // Get and remove the front of the queue
            TreeNode currNode = q.remove();

            // Get the current node's value from the string
            Integer currVal = array[i];

            // If the left child is not null
            if(currVal != null) {

                // Create the left child for the current node
                currNode.left = new TreeNode(currVal);

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= array.length)
                break;
            currVal = array[i];

            // If the right child is not null
            if(currVal != null) {

                // Create the right child for the current node
                currNode.right = new TreeNode(currVal);

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return this.list;
        }

        list.add(root.val);
        inorderTraversal(root.left);
        inorderTraversal(root.right);

        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return this.list;
        }

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        if (root == null) {
            return this.list;
        }

        inorderTraversal(root.left);
        inorderTraversal(root.right);
        list.add(root.val);

        return list;
    }
}
