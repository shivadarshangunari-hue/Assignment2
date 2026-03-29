package Assignment5.Module12;

    public class TreeHeight {
        Node root;

        int height(Node root) {
            if (root == null)
                return 0;

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static void main(String[] args) {
            TreeHeight tree = new TreeHeight();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);

            System.out.println("Height: " + tree.height(tree.root));
        }
    }

