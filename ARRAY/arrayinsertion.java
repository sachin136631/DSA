public class arrayinsertion{
    int arr[];
    public arrayinsertion(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
        
    }

    public void  insert(int location,int data){
        if(location< 0 || location>arr.length){
            System.out.println("invalid location");
        }
        
        else{
                if(arr[location]==Integer.MIN_VALUE){
                    arr[location]=data;
                    System.out.println("success");
                }
                else{
                    System.out.println("the location is already occupied");
                }
            
        }
    }

    public void traversal(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public void check(int value){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                j=i;
            }
        }

        if(j!=0){
            System.out.println("element found at index "+j);
        }
        else{
            System.out.println("element not found");
        }
    }

    public void delete(int location){
        if(location<0||location>arr.length){
            System.out.println("invalid index");
        }

        else{
            arr[location]=Integer.MIN_VALUE;
            
        }
    }

    public static void main(String []str){
        arrayinsertion key=new arrayinsertion(5);
        key.insert(0,1);
        key.insert(1,2);
        key.insert(2,3);
        key.insert(3,4);
        key.insert(4,5);

        key.traversal();
        key.check(4);



        
        
        

    }
}