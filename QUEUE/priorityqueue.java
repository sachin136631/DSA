class Node{
    int data;
    int priority;
    Node next;
}

public class priorityqueue {
    Node head=null;
    Node tail=null;
    Node temp=null;

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(int data , int priority){
        Node newnode=new Node();
        newnode.data=data;
        newnode.priority=priority;

        if(isEmpty()){
            head=newnode;
            newnode.next=null;
            return;
        }

        else if(priority<head.priority){
            newnode.next=head;
            head=newnode;
            return;
        }
        else{
            temp=head;
            while(temp.next!=null && temp.next.priority<=priority){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }

        else{
            head=head.next;
            return;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }

        else{
            System.out.println("the frontmost element is "+head.data);
            return;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }

        else{
            temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    }

    public static void main(String[]str){
        priorityqueue key= new priorityqueue();
        key.enqueue(40, 1);
        key.enqueue(30, 2);
        key.enqueue(20, 3);
        key.enqueue(10, 4);
        key.peek();
        key.dequeue();
        key.display();
    }
}
