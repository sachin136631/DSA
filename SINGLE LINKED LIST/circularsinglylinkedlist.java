class Node{
    int data;
    Node next;
}
public class circularsinglylinkedlist {
    Node head=null;
    Node tail=null;
    Node temp=null;
    int size=0;
    public Node create(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=newnode;
        head=newnode;
        tail=newnode;
        size++;
        return head;
    }

    public void insert(int data , int location){
        Node newnode=new Node();
        newnode.data=data;
        if(head==null){
            create(data);
            return;
        }

        else if(location==0){
            newnode.next=head;
            head=newnode;
            tail.next=head;
            size++;
            return;
        }

        else if(location>=size){
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
            size++;
            return;
        }

        else{
            temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;

            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
            return;

        }
    }

    public void traversal(){
        if(head==null){
            System.out.println("linked list doesnt exist.");
        }
        else{
            temp=head;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public void search(int value){
        int flag=0;
        int i;
         if(head==null){
            System.out.println("linkedlist not created yet");
            return;
         }
         else{
            temp=head;
            for(i=0;i<size;i++){
                if(temp.data==value){
                    flag=1;
                    break;
                }
                temp=temp.next;

            }
            if(flag==1){
                System.out.println("yay found at index "+i);
                return;
            }
            else{
                System.out.println("nah not found");
                return;
            }
         }
    }

    public void delete(int location){
        temp=head;
        if (head==null){
            System.out.println("linked list hasnt been created yet ");
            return;
        }
        if(location==0){
            if(size==1){
                head.next=null;
                head=null;
                tail=null;
                size--;
                return;

            }
            else{
                head=head.next;
                tail.next=head;
                size--;
                return;
            }
        }

        else if(location>=size){
            if(size==1){
                head.next=null;
                head=null;
                tail=null;
                size--;
                return;
                
            }
            else{
                for(int i=0;i<size-1;i++){
                    temp=temp.next;
                }
                
                temp.next=head;
                tail=temp;
                size--;
                return;
            }
        }

        else{
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
            return;
        }
    }

    public void deleteentire(){
        if(head==null){
            System.out.println("linked list hasnt been created ");
        }
        else{
            head=null;
            tail.next=null;
            tail=null;

        }
    }
    public static void main(String str[]){
        circularsinglylinkedlist list= new circularsinglylinkedlist();
        list.insert(10,0);
        list.insert(20,1);
        list.insert(30,2);
        list.insert(40,3);
        list.insert(50,4);
        list.insert(1,0);
        list.traversal();
        System.out.println("\n");
        list.delete(3);
        list.traversal();
    }
}
