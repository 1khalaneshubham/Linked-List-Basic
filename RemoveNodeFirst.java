public class RemoveNodeFirst {
    
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
    
    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }
        size++;

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int RemoveFirst(){

        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
        public static void main(String[] args) {

            RemoveNodeFirst obj = new RemoveNodeFirst();

            obj.addFirst(1);  // class addFist used kela aahe   
            obj.addFirst(2);
            obj.addFirst(3);  
            obj.addFirst(4);
            obj.addFirst(5);   
            obj.addFirst(6);
            obj.addFirst(7);   
            obj.addFirst(8);
            obj.addFirst(9);  
            obj.addFirst(10);
    
            // add in middle 
            obj.add(1,10);
    
            obj.print();
            System.out.println(obj.size);
            obj.RemoveFirst();
            obj.RemoveFirst();
            obj.RemoveFirst();
            obj.RemoveFirst();
            obj.RemoveFirst();
            
            obj.print();
            System.out.println(obj.size);

    }
}
