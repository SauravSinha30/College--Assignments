class BSTNode1 {
    int info;
    BSTNode1 left, right;

    public BSTNode1(int info) {
        this.info = info;
        this.left = this.right = null;
    }
}
public class Q1_BinarySearchTree {
    private BSTNode1 root;
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode1 insertRec(BSTNode1 root, int value) {
        if (root == null) {
            return new BSTNode1(value);
        }
        if (value < root.info) {
            root.left = insertRec(root.left, value);
        } else if (value > root.info) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void preOrderTraversal() {
        System.out.print("Pre-order Traversal: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(BSTNode1 node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BSTNode1 node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.info + " ");
            inOrder(node.right);
        }
    }

    public void postOrderTraversal() {
        System.out.print("Post-order Traversal: ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(BSTNode1 node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.info + " ");
        }
    }
    public static void main(String[] args) {
        Q1_BinarySearchTree bst = new Q1_BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }

        bst.preOrderTraversal();
        bst.inOrderTraversal();
        bst.postOrderTraversal();
    }
}
