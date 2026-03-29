package Assignment5.Module13;

public class BSTDelete {
    Node root;

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node with one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;


            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    public static void main(String[] args) {
        BSTDelete tree = new BSTDelete();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);

        tree.root = tree.delete(tree.root, 30);
        System.out.println("Node deleted");
    }
}

