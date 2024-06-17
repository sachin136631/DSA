class Nodeoftree{
    int data;
    Nodeoftree left;
    Nodeoftree right;
    int height;
}

class Nodeoflinky{
    Nodeoftree node;
    Nodeoflinky next;
}


class LL{
    Nodeoflinky head=null;
    Nodeoflinky tail=null;

    public void enqueue(Nodeoftree node){
        Nodeoflinky newnode=new Nodeoflinky();
        newnode.node=node;
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }

        else{
            tail.next=newnode;
            tail=tail.next;
        }
    }

    public Nodeoftree dequeue(){
        if(head==null){
            return null;
        }
        else{
            Nodeoftree temp=head.node;
            head=head.next;
            return temp;
        }
    }


}

public class binarytreeusinglinkedlist {
    Nodeoftree root;
    
    public binarytreeusinglinkedlist(){
        root=null;
    }

    public void preorder(Nodeoftree node){
        if(node==null){
            return;
        }
        else{
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Nodeoftree node){
        if(node==null){
            return;
        }
        else{
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

    public void inorder(Nodeoftree node){
        if(node==null){
            return;
        }
        else{
            inorder(node.left);
            System.out.print(node.data);
            inorder(node.right);
        }
    }

    public void levelorder(){
        if(root==null){
            return;
        }

        else{
            LL queue = new LL();
            queue.enqueue(root);
            while(queue.head!=null){
                Nodeoftree current = queue.dequeue();
                System.out.print(current.data+"  ");
                if(current.left!=null){
                    queue.enqueue(current.left);
                }
                if(current.right!=null){
                    queue.enqueue(current.right);
                }
            }
        }

    }

    public void search(int data){

        if(root==null){
            return;
        }
        else{
            LL queue =new LL();
            queue.enqueue(root);
            while(queue.head!=null){
                Nodeoftree current= queue.dequeue();
                if(current.data==data){
                    System.out.println("the key found in the tree");
                    return;
                }
                else{
                    if(current.left!=null){
                        queue.enqueue(current.left);
                    }
                    if(current.right!=null){
                        queue.enqueue(current.right);
                    }
                }
            }
            System.out.println("the value not found in the tree");

        }
    }

    public void insert(int data) {
        Nodeoftree newnode = new Nodeoftree();
        newnode.data = data;
        if (root == null) {
            root = newnode;
            return;
        } else {
            LL queue = new LL();
            queue.enqueue(root);
    
            while (queue.head!= null) {
                Nodeoftree current = queue.dequeue();
                if (current.left == null) {
                    current.left = newnode;
                    return;
                } else if (current.right == null) {
                    current.right = newnode;
                    return;
                } else {
                    if (current.left!= null) {
                        queue.enqueue(current.left);
                    }
                    if (current.right!= null) {
                        queue.enqueue(current.right);
                    }
                }
            }
        }
    }

    public static void main(String str[]){
        binarytreeusinglinkedlist key=new binarytreeusinglinkedlist();
        key.insert(1);
        key.insert(2);
        key.insert(3);
        key.insert(4);
        key.levelorder();
        key.preorder(key.root);
    }
}  
