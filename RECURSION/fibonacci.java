import java.util.*;
public  class fibonacci {
    public static int fibo(int data){
        if(data==1 || data==0){
            return data;
        }

        else{
            return fibo(data-1)+fibo(data-2);
        }
    }

    public static void main(String[]str){

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the the number to find fibonacci :");
        int data = sc.nextInt();
        System.out.println("the fibonacci number is :"+fibo(data));
        sc.close();

    }

}
