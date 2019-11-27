public class Tree {

    private Node root;

    public void insert(float value) {
        if (this.root == null) this.root = new Node(value);
        else insert(this.root, value);
    }

    private void insert(Node node, float value) {
        if (value < node.getValue()) {
            if (node.getLeft() != null) insert(node.getLeft(), value);
            else node.setLeft(new Node(value));
        } else {
            if (node.getRight() != null) insert(node.getRight(), value);
            else  node.setRight(new Node(value));
        }
    }

    public int amountOfNodes() { return amountOfNodes(this.root); }

    private int amountOfNodes(Node root) {
        if (root == null) { return 0; }
        return amountOfNodes(root.getRight()) + amountOfNodes(root.getLeft()) + 1;
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node root) { this.root = root; }
}
