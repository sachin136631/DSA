class Node{
    int data;
    Node next;
}

public class stackusinglinkedlist {
    Node head=null;
    int size=0;

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void create(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        head=newnode;

    }

    public void push(int data){
        if(isEmpty()){
            create(data);
        }
        else{
            Node newnode=new Node();
            newnode.data=data;
            newnode.next=head;
            head=newnode;

        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("nothing to show");
            return;
        }
        else{
            System.out.println("the value of the last node is "+head.data);
            return;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("nothing to show stack is empty ");
            return;
        }
        else{
            head=head.next;
            return;
        }
    }

    public static void main(String str[]){
        stackusinglinkedlist key= new stackusinglinkedlist();

        key.push(10);
        key.push(20);
        key.push(30);
        key.pop();
        key.pop();
        key.pop();
        key.push(505);
        key.peek();

    }

}
