public class LinkedList {
    Node head;

    void size(){
        Node current = head;
        int count =0;
        while (current!=null){
            count ++;
            current = current.next;
        }
        System.out.println(count);
    }


    boolean search(int data){
        Node current = head;

        while (current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }

        return false;
    }



    void remove_front(){
         if(head == null){
             return;
         }
         head = head.next;
    }


    void remove_back(){
        if(head == null){
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null){
            current= current.next;
        }
        current.next = null;
    }


    void addfront(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head=newNode;
    }

    void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next!= null){
            current = current.next;
        }
        current.next = newNode;
    }

    void display(){
        Node current = head;

        while (current!=null){
            System.out.print(current.data +"->");
            current = current.next;
        }
        System.out.println("null");
    }
}
