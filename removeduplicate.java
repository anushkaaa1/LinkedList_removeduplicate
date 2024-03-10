//remove duplicates from sorted list
public class removeduplicate {
    Node head,tail;
    
    public removeduplicate(){
        head = tail = null;
    }
    public class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void  create(int s){
        Node n = new Node(s);
        if(head == null)
            tail = head = n;
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void printlist(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
            System.out.println(head.data);
            head = head.next;
          }
        }
    }
    public void remove(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
           Node temp = head;
           while(temp!=null){
            if(temp.next.data == temp.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
            if(temp.next == null){
                break;
            }
           }
        }
    }
    public static void main(String[] args) {
        removeduplicate list = new removeduplicate();
        list.create(1);
        list.create(1);
        list.create(1);
        list.create(2);
        list.create(2);
        list.create(3);
        list.create(3);
        list.create(3);
        list.printlist(list.head);
        list.remove();
        System.out.println();
        list.printlist(list.head);
    }
}
