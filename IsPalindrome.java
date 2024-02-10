public class IsPalindrome {
    
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

    // Reverse a linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; // remove first
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev =  head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }
        return slow;  // slow is my midNode 
    }

    public boolean checkPalindrom() {

        if(head == null || head.next == null){
            return true;
        }
        // step1- find mid
        Node miNode = findMid(head);

        // step2- reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;

        while (curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;

        }

        Node right = prev; // right half head
        Node left = head;

        // step3- check left half & right half

        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        
        IsPalindrome obj = new IsPalindrome();

        // obj.addFirst(2);
        // obj.addFirst(1);
        
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(2);
        obj.addLast(1);
        
        obj.print();

        System.out.println(obj.checkPalindrom());

        obj.print();
        
    }
}

