public class Test {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(5.3f);
        t.insert(5.3f);
        t.insert(5.3f);
        System.out.println(t.amountOfNodes());
    }
}