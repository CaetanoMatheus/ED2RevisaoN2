public class Node {

    private float value;
    private Node left;
    private Node right;

    public Node() {}

    public Node(float value) { this.value = value; }

    public float getValue() { return this.value; }

    public void setValue(float value) { this.value = value; }

    public Node getLeft() { return this.left; }

    public void setLeft(Node left) { this.left = left; }

    public Node getRight() { return this.right; }

    public void setRight(Node right) { this.right = right; }   
}
