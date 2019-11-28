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

    public int amountOfNodesNotLeaf() { return amountOfNodesNotLeaf(this.root); }

    private int amountOfNodesNotLeaf(Node root) {
        if (root == null || 
        root.getLeft() == null && root.getRight() == null) return 0;
        return 
        amountOfNodesNotLeaf(root.getLeft()) + amountOfNodesNotLeaf(root.getRight()) + 1;
    }

    public int amountOfLeafs() { return amountOfLeafs(this.root); }

    private int amountOfLeafs(Node root) {
        if (root == null ) return 0;
        if (root.getLeft() == null && root.getRight() == null) return 1;
        return amountOfLeafs(root.getLeft()) + amountOfLeafs(root.getRight());
    }

    public int height() {
        return height(this.root) - 1;
    }
    
    private int height(Node node) {
        if (node == null) return 0; 
        else {
            int left = height(node.getLeft()) + 1;
            int right = height(node.getRight()) + 1;
            return left > right ? left : right;            
        }
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node root) { this.root = root; }
}
