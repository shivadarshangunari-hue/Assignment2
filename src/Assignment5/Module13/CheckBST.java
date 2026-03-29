package Assignment5.Module13;

public class CheckBST {
    Node root;

    boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);

        System.out.println(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}

