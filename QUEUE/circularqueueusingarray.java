public class circularqueueusingarray {
    int rear;
    int front;
    int arr[];

    public circularqueueusingarray(int size){
        arr=new int[size];
        rear=-1;
        front=-1;

    }

    public boolean isFull(){
        if((rear+1)%arr.length==front){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("the queue is full ");
            return;
        }
        else if(isEmpty()){
            front=0;
            rear=(rear+1)%arr.length;
            arr[rear]=data;
            return;

        }
        
        else{
            rear=(rear+1)%arr.length;
            arr[rear]=data;
            return;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }

        else if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%arr.length;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }
        else{
            System.out.println("the the current front element is "+arr[front]);
            return;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[]str){
        circularqueueusingarray key=new circularqueueusingarray(4);
        key.enqueue(1);
        key.enqueue(2);
        key.enqueue(3);
        key.enqueue(4);
        key.dequeue();
        key.dequeue();
        key.dequeue();
        key.dequeue();
        key.display();
        key.enqueue(0);
        key.display();
    }
}
