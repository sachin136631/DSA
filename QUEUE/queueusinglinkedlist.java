class Node{
    int data;
    Node next;
}

public class queueusinglinkedlist {
    Node head=null;
    Node tail=null;
    Node temp=null;
    int size=0;

    public Node create(int data){
        Node newnode=new Node();
        newnode.data=data;
        head=newnode;
        tail=newnode;
        newnode.next=null;
        size=1;
        return head;
    }

    public void enqueue(int data){
        if(head==null){
            create(data);
        }
        else{
            Node newnode=new Node();
            newnode.data=data;
            tail.next=newnode;
            tail=newnode;
            tail.next=null;
            size++;
            return;
        }
    }

    public void dequeue(){
        if(head==null){
            System.out.println("the queue is empty");
            return;
        }

        else{
            head=head.next;
            size--;
            return;
        }
    }

    public void peek(){
        if(head==null){
            System.out.println("the queue is empty");
            return;
        }

        else{
            System.out.println(head.data);
            return;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("the queue is empty");
            return;
        }

        else{
            temp=head;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[]str){
        queueusinglinkedlist key=new queueusinglinkedlist();
        key.enqueue(0);
        key.enqueue(0);
        key.enqueue(0);
        key.enqueue(0);
        key.display();
    }


    
}
