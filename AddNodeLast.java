public class AddNodeLast {
 
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

    public void addFirst(int data){

        // // step1 = create new Node
        Node newNode = new Node(data);

        if(head == null){

            head = tail = newNode;
            return;
        }

        // // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }
        
    public void addLast(int data){
        
        Node newNode = new Node(data);
            
        if(head == null){

            head = tail = newNode;
            
            return;

        }
    
        tail.next = newNode; 

        tail = newNode;
    
    }

    // Print kart data
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
        System.out.println("Null");
    }
    public static void main(String[] args) {
        
        AddNodeLast obj = new AddNodeLast(); // main class la call kart 

        obj.print();
        obj.addLast(1);   
        obj.addLast(2);
        obj.print();
        obj.addLast(3);  
        obj.addLast(4);
        obj.print();
        obj.addLast(5);   
        obj.addLast(6);
        obj.print();
        obj.addLast(7);   
        obj.addLast(8);
        obj.print();
        obj.addLast(9);  
        obj.addLast(10);
    }
}

