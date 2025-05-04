class BSTNode2 {
    int info;
    BSTNode2 left, right;

    public BSTNode2(int info) {
        this.info = info;
        left = right = null;
    }
}
public class Q3_ValidateBST {
    public static boolean isBST(BSTNode2 node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.info <= min) || (max != null && node.info >= max)) {
            return false;
        }
        return isBST(node.left, min, node.info) && isBST(node.right, node.info, max);
    }

    public static void main(String[] args) {

        BSTNode2 root = new BSTNode2(50);
        root.left = new BSTNode2(30);
        root.right = new BSTNode2(70);
        root.left.left = new BSTNode2(20);
        root.left.right = new BSTNode2(40);
        root.right.left = new BSTNode2(60);
        root.right.right = new BSTNode2(80);

        if (isBST(root, null, null)) {
            System.out.println("The given tree is a Binary Search Tree.");
        } else {
            System.out.println("The given tree is NOT a Binary Search Tree.");
        }
    }
}
