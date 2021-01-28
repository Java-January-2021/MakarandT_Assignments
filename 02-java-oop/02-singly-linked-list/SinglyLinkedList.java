import java.util.Currency;

public class SinglyLinkedList {
    public Node head;
    int size;

    public SinglyLinkedList() {
        this.head=null;
        this.size=0;
    }

    // Create a constructor method that sets the head to null of your
    // SinglyLinkedList objects
    // public SinglyLinkedList(Node head) {
    //     this.head = head;
    //     this.size=0;
    //    // head = null;
    // }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void addToList(int value) {
        Node newNode = new Node(value);
        //If head is null that means the list is empty 
        if (this.head == null) {
            this.head = newNode;
            System.out.println(value + " has been aded as the head node");
            this.size++;
        } else {
            Node runner = this.head;
            //Runner.next is null means this is last node in the linklist
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            System.out.println(value + " has ben added to the end of the list");
            this.size++;
        }
    }

        public void displayList(){
            if(this.head ==null){
                System.out.println("List is empty");
            }
            Node runner = this.head;
            int counter =0;
            while (runner != null){
                if(counter < 1){
                    System.out.println("Head: " + runner.value);
                    counter++;
                    runner = runner.next;
                }else {
                    System.out.println("Node "+ counter + " : " +runner.value);
                    runner= runner.next;
                    counter++;
                }
            }

        }

        //search list 

        public boolean searchList(int value){
            if(this.head ==null){
                System.out.println("List is empty");
            }
            Node runner = this.head; 
            while(runner != null){
                    if (runner.value ==value){
                        return true;
                    }
                    runner = runner.next;
                }
                return false;
            }
        
        //remove from list 2 types 
        public void removeFromEndOfList(){
            if(this.head ==null){
                System.out.println("List is empty,Nothing  to remove");
            }
            Node runner = this.head;
            while( runner.next.next != null){
                runner = runner.next;
            }
            runner.next =null;
        }
            
        // remove at nth place
        public void removeAt(int n){
            if(this.head ==null){
                System.out.println("List is empty,Nothing  to remove");
            }
            Node runner =this.head;

            if (n==0 && this.size >1){
                this.head = runner.next;
            } else{
                int counter =0;
                while(runner.next != null){
                    if(counter == n-1){
                        runner.next =runner.next.next;
                        return;
                    }
                    runner = runner.next;
                    counter++;
                }

            }


            }

        // Create a remove() method that will remove a node from the end of your list
        // public void remove(int value) {
        // Node newNode = new Node(value);
        // if(head == null) {
        // head = newNode;
        // } else {
        // Node runner = head;
        // while(runner.next != null) {
        // runner = runner.next;
        // }
        // runner.next = newNode;
        // }
        // }
        
        // Create printValues() method that will print all the values of each node in
        // the list in order


        //Create a ListTester class like the above.

    
}