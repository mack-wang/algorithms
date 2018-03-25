public class Node {
    // 链表
    Object item;
    Node next;

    public static void main(String[] args) {
        Node first =  new Node();
        Node second =  new Node();
        Node third =  new Node();
        first.item = 1;
        first.next = second;
        second.item = 2;
        second.next = third;
        third.item = 3;
        System.out.println(first.item);
        System.out.println(first.next.item);
        System.out.println(first.next.next.item);
    }
}
