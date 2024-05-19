class Node{
    int data;
    Node next;
    Node prev;
}


public class doublylinkedlist{
    Node head=null;
    Node tail=null;
    Node current=null;
    int size=0;
    public Node create(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        newnode.prev=null;
        head=newnode;
        tail=newnode;
        size++;
        return head;
    }

    public void insert(int data, int location){
        Node newnode=new Node();
        newnode.data=data;
        if(head==null){
            create(data);
            return;
        }

        else if(location==0){
            newnode.next=head;
            head.prev=newnode;
            newnode.prev=null;
            head=newnode;
            size++;
            return;
        }

        else if(location>=size){
            tail.next=newnode;
            newnode.prev=tail;
            newnode.next=null;
            tail=newnode;
            size++;
            return;
        }

        else{
            for(int i=0;i<location-1;i++){
                current=current.next;
            }
            newnode.next=current.next;
            current.next.prev=newnode;
            current.next=newnode;
            newnode.prev=current;
            size++;
            return;
        }
    }
    public void traversal(){
        current=head;
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else{
            for(int i=0;i<size;i++){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println("\n");
        }
    }

    public void reversetraversal(){
        current=tail;
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else{
            for(int i=0;i<size;i++){
                System.out.print(current.data+" ");
                current=current.prev;
            }
            System.out.println("\n");
        }
    }

    public void search(int value){
        int flag=0,i;
        current=head;
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else{
            for(i=0;i<size;i++){
                if(current.data==value){
                    flag=1;
                    break;
                }
                current=current.next;
            }
            if(flag==1){
                System.out.println("kittiyeda at "+i);
                return;
            }
            else{
                System.out.println("not found");
            }
        }

    }

    public void delete(int location){
        current=head;
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else if(location==0){
            if(head.next==null){
                head=null;
                tail=null;
                size--;
                return;
            }

            else{
                tail=head.next;
                head=head.next;
                head.prev=null;
                size--;
                return;
            }
        }

        else if(location>=size){
            if(head.next==null){
                head=null;
                tail=null;
                size--;
                return;
            }
            else{
                tail=tail.prev;
                tail.next=null;
                size--;
                return;
            }
        }

        else{
            for(int i=0;i<location-1;i++){
                current=current.next;
            }
            current.next=current.next.next;
            current.next.prev=current;
            size--;
            return;
        }


    }

    public void deleteentire(){
        current=head;
        for(int i=0;i<size;i++){
            current.prev=null;
            current=current.next;
        }
        head=null;
        tail=null;
        System.out.println("the entire linked list has been obliterated");
    }
    public static void main(String[]str){
        doublylinkedlist key=new doublylinkedlist();
        key.create(456);
        key.traversal();
        key.delete(0);
        key.traversal();

    }
}