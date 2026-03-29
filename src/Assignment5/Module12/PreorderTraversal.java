package Assignment5.Module12;


    public class PreorderTraversal {
        Node root;

        void preorder(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        public static void main(String[] args) {
            PreorderTraversal tree = new PreorderTraversal();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            tree.preorder(tree.root);
        }
    }

