package Assignment5.Module13;

public class BSTMinMax {
    Node root;

    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);

        System.out.println("Min: " + tree.findMin(tree.root));
        System.out.println("Max: " + tree.findMax(tree.root));
    }
}

