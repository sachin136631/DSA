public class queueusingarray {
    int arr[];
    int top;
    int beginning;

    public queueusingarray(int size){
        arr=new int[size];
        top=-1;
        beginning=-1;
    }

    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(beginning==-1||beginning==arr.length||beginning>top){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("the queue is full");
            return;
        }
        else if(isEmpty()){
            beginning=top=0;
            arr[top]=data;
            return;
        }
        else{
            top++;
            arr[top]=data;
            return;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty ");
            return;
        }
        else{
            beginning++;
            System.out.println("the first element has been removed");
            return;
        }
    }



    public void peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }
        else{
            System.out.println("the current first element is "+arr[beginning]);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("the queue is empty");
        }
        else{
            for(int i=beginning;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public void obliteratequeue(){
        arr=null;
        System.out.println("the entire queue has been obliterated");
        return;
    }

    public static void main(String []str){
        queueusingarray key=new queueusingarray(3);
        key.enqueue(100);
        key.enqueue(100);
        key.enqueue(400);
        key.dequeue();
        key.enqueue(800);
        key.display();



    }
}


