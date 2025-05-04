class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}
public class Q2_BinarySearchTree {
    public static TreeNode CreateTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);

        root.left = CreateTree(arr, start, mid - 1); // Left subtree
        root.right = CreateTree(arr, mid + 1, end);  // Right subtree

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        TreeNode bstRoot = CreateTree(arr, 0, arr.length - 1);

        System.out.println("Inorder Traversal of BST:");
        inorderTraversal(bstRoot);
    }
}
