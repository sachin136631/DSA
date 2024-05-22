class Node{
    int data;
    Node next;
    Node prev;
}

public class circulardoublelinkedlist{
    Node head=null;
    Node tail=null;
    Node temp=null;
    int size=0;
    public Node create(int data){
        Node newnode=new Node();
        newnode.data=data;
        head=newnode;
        tail=newnode;
        newnode.next=newnode;
        newnode.prev=newnode;
        size++;
        return head;
    }

    public void insert(int data,int location){
        Node newnode=new Node();
        newnode.data=data;
        temp=head;
        if(head==null){
            create(data);
            return;
        }
        else if(location==0){
            newnode.next=head;
            head.prev=newnode;
            newnode.prev=tail;
            tail.next=newnode;
            head=newnode;
            size++;
            return;

        }
        else if(location>=size){
            tail.next=newnode;
            newnode.prev=tail;
            newnode.next=head;
            head.prev=newnode;
            tail=newnode;
            size++;
            return;
        }

        else{
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
            size++;
            return;
        }
    }

    public void traversal(){
        
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else{
            temp=head;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }System.out.println("\n");
        }
    }

    public void reversetraversal(){
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }
        else{
            temp=tail;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }System.out.println("\n");
        }
    }

    public void search(int data){
        int flag=0,i;
        temp=head;
        for(i=0;i<size;i++){
            if(temp.data==data){
                flag=1;
                break;
            }
            else{
                temp=temp.next;
            }
        }
        if(flag==1){
            System.out.println("kittiyeda at index "+i);
            return;
        }
        else{
            System.out.println("kittillalo :(");
            return;
        }
    }

    public void delete(int location){
        if(head==null){
            System.out.println("linked list not created yet");
            return;
        }

        else if(location==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }
            else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
                size--;
                return;
            }
        }

        else if(location>=size){
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
            size--;
            return;
        }

        else{
            temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            size--;
            return;
        }
    }

    public void deleteentire(){
        if(head==null){
            System.out.println("linked list doesnt exist");
            return;
        }
        else{
            temp=head;
            tail.next=null;
            for(int i=0;i<size;i++){
                temp.prev=null;
                temp=temp.next;
            }
            System.out.println("entire linked list has been obliterated");
        }
    }

    public static void main(String str[]){
        circulardoublelinkedlist key=new circulardoublelinkedlist();
        key.insert(10,0);
        key.insert(20,1);
        key.insert(30,2);
        key.insert(40,3);
        key.insert(50,4);
        key.traversal();
        key.delete(4);
        key.traversal();
    }
}