package Assignment5.Module12;


    public class PostorderTraversal {
        Node root;

        void postorder(Node root) {
            if (root != null) {
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }
        }

        public static void main(String[] args) {
            PostorderTraversal tree = new PostorderTraversal();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            tree.postorder(tree.root);
        }
    }

