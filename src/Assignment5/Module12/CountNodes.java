package Assignment5.Module12;

    public class CountNodes {
        Node root;

        int countNodes(Node root) {
            if (root == null)
                return 0;

            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        public static void main(String[] args) {
            CountNodes tree = new CountNodes();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        }
    }

