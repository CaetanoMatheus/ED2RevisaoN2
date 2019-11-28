public class Test {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(14f);
        t.insert(15f);
        t.insert(3f);
        t.insert(4f);
        t.insert(9f);
        t.insert(7f);
        t.insert(18f);
        t.insert(3f);
        t.insert(5f);
        t.insert(16f);
        t.insert(4f);
        t.insert(20f);
        t.insert(17f);
        t.insert(9f);
        t.insert(14f);
        t.insert(5f);
        t.insert(15f);
        t.insert(16f);
        t.insert(9f);
        t.insert(11f);
        t.insert(3f);
        System.out.println(t.height());
    }
}