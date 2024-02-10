public class SearchIerative {

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

    public void addLast(int data){
        
        Node newNode = new Node(data);
            
        if(head == null){

            head = tail = newNode;
            
            return;

        }
    
        tail.next = newNode; 

        tail = newNode;
    
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

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if(temp.data == key){ // key found case
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found case
        return -1;
    }
    public static void main(String[] args) {
        
        SearchIerative obj = new SearchIerative();

        obj.addFirst(2);
        obj.addFirst(1);
        
        obj.addLast(4);
        obj.addLast(5);

        obj.add(2,3);
        
        obj.print();

        System.out.println(obj.itrSearch(4));
        System.out.println(obj.itrSearch(10));
        
    }
}

