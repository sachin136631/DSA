public class stackusingarray{
int top;
int arr[];

public stackusingarray(int size){
    arr=new int[size];
    top=-1;
    System.out.println("array of size "+size+" has been created");
}

public boolean isEmpty(){
    if(top==-1){
        return true;
    }
    else{
        return false;
    }
}

public boolean isFull(){
    if(top==arr.length-1){
        return true;
    }
    else{
        return false;
    }
}

public int push(int data){
    if(isFull()){
        System.out.println("the stack is full");
        return 0;
    }
    else{
        top++;
        arr[top]=data;
        return data;
    }
}

public int pop(){
    if(isEmpty()){
        System.out.println("the stack is empty");
        return 0;
    }
    else{
        if(top==0){
            System.out.println("all elements removed");
            top--;
            return -1;
            
        }
        else{
            top--;
            return arr[top];
        }
    }
}

public int peek(){
    if(isEmpty()){
        System.out.println("the stack is empty");
        return 0;
    }
    else{
        System.out.println("the last element is stack is "+arr[top]);
        return 1;
    }
}

public static void main(String str[]){
    stackusingarray key=new stackusingarray(5);
    key.push(1);
    key.push(2);
    key.push(3);
    key.push(4);
    key.push(5);
    key.pop();
    key.pop();
    key.pop();
    key.pop();
    key.pop();
    key.push(10);
    key.peek();
   

}

}