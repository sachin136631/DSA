import java.util.ArrayList;
public class arraylist {
    public static void main(String str[]){
        int count=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1,23);
        System.out.print(arr);
        arr.remove(2);
        System.out.print(arr);
    
        
    }
}


    

