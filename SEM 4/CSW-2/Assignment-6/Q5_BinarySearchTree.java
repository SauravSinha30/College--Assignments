class BSTNode3 {
    int info;
    BSTNode3 left, right;

    public BSTNode3(int info) {
        this.info = info;
        left = right = null;
    }
}
public class Q5_BinarySearchTree {
    private BSTNode3 root;

    public Q5_BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode3 insertRec(BSTNode3 root, int value) {
        if (root == null) {
            return new BSTNode3(value);
        }
        if (value < root.info) {
            root.left = insertRec(root.left, value);
        } else if (value > root.info) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private BSTNode3 deleteRec(BSTNode3 root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.info) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.info) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            else {
                BSTNode3 successor = findMin(root.right);
                root.info = successor.info;
                root.right = deleteRec(root.right, successor.info);
            }
        }
        return root;
    }

    private BSTNode3 findMin(BSTNode3 node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BSTNode3 node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.info + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Q5_BinarySearchTree bst = new Q5_BinarySearchTree();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }
        bst.inOrderTraversal();
        bst.delete(50);
        bst.inOrderTraversal();
    }
}
