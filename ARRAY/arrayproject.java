import java.util.Scanner;
class arrayproject{
    int arr[];
    float sum=0;
    float avg;
    int count=0;

    public void arraymaker(int x){
        Scanner sc = new Scanner(System.in);
        arr=new int[x];
        for(int i=0;i<x;i++){
            System.out.println("enter the "+i+" day temperature");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            sum=sum+arr[i];
        }
        avg=sum/x;
        System.out.println(avg+" is the average temperature");

        for(int i=0;i<x;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println(count+" day has temperature greater than average temperature");
    }
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        arrayproject key=new arrayproject();
        
        System.out.println("how many day's temperature do you want to measure :");
        int x=sc.nextInt();
        key.arraymaker(x);
        sc.close();



    }
}