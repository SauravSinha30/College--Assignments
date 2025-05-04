class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (Population: " + population + ")";
    }
}

class BNode {
    Country data;
    BNode left, right;

    public BNode(Country data) {
        this.data = data;
        left = right = null;
    }
}
public class Q4_BSTCountry {
    private BNode root;

    public Q4_BSTCountry() {
        root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            return new BNode(country);
        }
        if (country.population < root.data.population) {
            root.left = insertRec(root.left, country);
        } else if (country.population > root.data.population) {
            root.right = insertRec(root.right, country);
        }
        return root;
    }

    public void inOrderTraversal() {
        System.out.print("In-order Traversal (Sorted by population): ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " | ");
            inOrder(node.right);
        }
    }

    public Country findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public Country findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public static void main(String[] args) {
        Q4_BSTCountry bst = new Q4_BSTCountry();

        bst.insert(new Country("India", 1400000000));
        bst.insert(new Country("USA", 331000000));
        bst.insert(new Country("China", 1441000000));
        bst.insert(new Country("Brazil", 213000000));
        bst.insert(new Country("Germany", 83000000));
        bst.inOrderTraversal();
        System.out.println("Country with Maximum Population: " + bst.findMax());
        System.out.println("Country with Minimum Population: " + bst.findMin());
    }
}
