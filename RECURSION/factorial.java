import java.util.Scanner;

class factorial{
    public int fact(int data){
        if(data==1 || data==0){
            return 1;
        }

        else{
            return data*fact(data-1);
        }
    }

    public static void main(String[]str){
        factorial key =new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number whose factorial you wanna find : ");
        int data=sc.nextInt();
        System.out.println("the factorial of the given number is "+key.fact(data));
        sc.close();
    }
}