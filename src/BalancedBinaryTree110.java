public class BalancedBinaryTree110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        // Example usage
        BalancedBinaryTree110 tree = new BalancedBinaryTree110();
        // Constructing a balanced binary tree [1,2,2,3,3,null,null,4,4]
        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(2);
        root.left.left = tree.new TreeNode(3);
        root.left.right = tree.new TreeNode(3);
        root.left.left.left = tree.new TreeNode(4);
        root.left.left.right = tree.new TreeNode(4);
        // Check if the tree is balanced

        boolean isBalanced = dfs(root) != -1;
        System.out.println("Is the tree balanced? " + isBalanced);
    }

    public static int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = dfs(node.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced

        int rightHeight = dfs(node.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is not balanced
        }
        return Math.max(leftHeight, rightHeight) + 1; // Return height of the current node
    }
}
