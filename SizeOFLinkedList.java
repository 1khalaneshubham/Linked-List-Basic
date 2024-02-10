public class SizeOFLinkedList {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        // step1 = create new Node
        Node newNode = new Node(data);
        size++;

        if(head == null){

            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    public void print(){

        if(head == null){
            System.out.println("LL is Empty");
            return;
        }  
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
        SizeOFLinkedList obj = new SizeOFLinkedList();

        obj.print();
        obj.addFirst(1);  // class addFist used kela aahe   
        obj.addFirst(2);
        obj.print();
        obj.addFirst(3);  
        obj.addFirst(4);
        obj.print();
        obj.addFirst(5);   
        obj.addFirst(6);
        obj.print();
        obj.addFirst(7);   
        obj.addFirst(8);
        obj.print();
        obj.addFirst(9);  
        obj.addFirst(10);

        obj.print();
        System.out.println(obj.size);
    }
        
}
