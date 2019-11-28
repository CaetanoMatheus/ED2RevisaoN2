public class Test {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(5.3f);
        t.insert(4f);
        t.insert(6f);
        t.insert(10f);
        t.insert(0f);
        t.insert(2f);
        t.insert(1f);
        t.insert(3f);
        System.out.println(t.height());
    }
}