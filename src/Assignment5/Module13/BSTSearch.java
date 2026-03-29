package Assignment5.Module13;


    public class BSTSearch {
        Node root;

        boolean search(Node root, int key) {
            if (root == null) return false;

            if (root.data == key) return true;

            if (key < root.data)
                return search(root.left, key);
            else
                return search(root.right, key);
        }

        public static void main(String[] args) {
            BSTSearch tree = new BSTSearch();
            tree.root = new Node(50);
            tree.root.left = new Node(30);
            tree.root.right = new Node(70);

            System.out.println(tree.search(tree.root, 30)); // true
        }
    }

