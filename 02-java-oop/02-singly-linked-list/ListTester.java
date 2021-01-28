public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        Node newNode =new Node(19);
        


        sll.addToList(3);
        sll.addToList(4);
        sll.addToList(10);
        sll.addToList(5);
        sll.addToList(15);
        sll.addToList(2);
        // sll.remove();
        // sll.remove();
         sll.displayList();
        System.out.println( sll.searchList(15));
        System.out.println( sll.searchList(33));
        sll.displayList();
        sll.removeFromEndOfList();
        sll.displayList();
        sll.removeAt(2);
        sll.displayList();
    }
}