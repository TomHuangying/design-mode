package hashMap;

public class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) {
        Node node = new Node(new Object(),null);
//        Node node = new Node(new Object(),null);
        new Node(new Object(),node);
    }
}
