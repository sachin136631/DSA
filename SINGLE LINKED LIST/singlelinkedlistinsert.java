class Node{
    int data;
    Node next;
}

public class singlelinkedlistinsert{
    Node head=null;
    Node tail=null;
    Node temp=null;
    int size=0;

    public Node createlist(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        head=newnode;
        tail=newnode;
        size++;
        return head;
    }

    public void insert(int data,int location){
        Node newnode=new Node();
        newnode.data=data;
        if(head==null){
            createlist(data);
            return;
        }

        else if(location==0){
            newnode.next=head;
            head=newnode;
            size++;
            return;
        }

        else if(location>=size){
            newnode.next=null;
            tail.next=newnode;
            tail=newnode;
            size++;
            return;

        }

        else{
            int index=0;
            temp=head;
            while(index<location-1){
                temp=temp.next;
                index++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
            return;
            

        }
        
    }

    public void traversal(){
        if(head==null){
            System.out.println("linked list not yet created");
        }
        else{
            temp=head;
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
                
            }
        }
    }

    public void search(int data){
        int flag=0;
        int i;
        if(head==null){
            System.out.println("linked list not created");
        }
        else{
            temp=head;
            for(i=0;i<size;i++){
                if(temp.data==data){
                    flag=1;
                    
                    break;
                }
                else{
                    flag=0;
                }
                temp=temp.next;
            }

            if(flag==1){
                System.out.println("yay found at index "+i);
            }
            else{
                System.out.println("not found");
            }
        }
    }

    public void delete(int location){
        if(head==null){
            System.out.println("the linked list has not been created");
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
                head=head.next;
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
                temp=head;
                for(int i=0;i<size-1;i++){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;
                return;
            }
        }

        else{
            temp=head;
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
            return;
        }

        
    }

    public void deletefull(){
        head=null;
        tail=null;
        System.out.println("the linked list has been completely destroyed");
    }

    public static void main(String[]str){
        singlelinkedlistinsert list = new singlelinkedlistinsert();
    

        list.insert(10, 0);  
        list.insert(20, 1);  
        list.insert(30, 2);  
        list.insert(40, 1);
        list.traversal();
        System.out.println("\n");
        System.out.println(list.size);
        list.delete(2);
        list.traversal();

    }



}