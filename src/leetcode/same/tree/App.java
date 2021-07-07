package leetcode.same.tree;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app      //  true
                .isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3))
                        , new TreeNode(1, new TreeNode(2), new TreeNode(3))));

        System.out.println(app      //  false
                .isSameTree(new TreeNode(1, new TreeNode(2), null)
                        , new TreeNode(1, null, new TreeNode(2))));

        System.out.println(app      //  false
                .isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(1))
                        , new TreeNode(1, new TreeNode(1), new TreeNode(2))));

        System.out.println(app      //  true
                .isSameTree(null, null));

        System.out.println(app      //  false
                .isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3,
                                new TreeNode(4), new TreeNode(5)))
                        , new TreeNode(1, new TreeNode(2), new TreeNode(3))));

        System.out.println(app      //  false
                .isSameTree(new TreeNode(10, new TreeNode(5), new TreeNode(15))
                        , new TreeNode(10, new TreeNode(5, null, new TreeNode(15)), null)));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pString = treeToString(new StringBuilder(), p);
        String qString = treeToString(new StringBuilder(), q);
        return pString.equals(qString);
    }

    private String treeToString(StringBuilder sb, TreeNode treeNode) {
        if(treeNode == null)
            return sb.append("null").toString();

        sb.append(treeNode.val);
        if (treeNode.left != null) {
            treeToString(sb, treeNode.left);
        }
        if (treeNode.right != null) {
            sb.append("null");
            treeToString(sb, treeNode.right);
        }
        if (treeNode.right == null) {
            sb.append("null");
        }

        return sb.toString();
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
