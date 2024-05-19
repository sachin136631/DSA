public class twoarray{
    int arr[][];

    public twoarray(int row , int col){
        arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }

    }

    public void  insert(int row , int col , int value){
        if(arr[row][col]==Integer.MIN_VALUE){
            arr[row][col]=value;
            System.out.println("inserted successfully");
        }
        else{
            System.out.println("insertion failed");
        }

    }

    public void access(int row, int col){
        System.out.println("the cell value is "+arr[row][col]);
    }

    public void traverse(int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println("\n");
        }
    }

    public void search(int row, int col ,int value){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==value){
                    System.out.println("element found at index "+i+" "+j);
                }
            }
        }
    }

    public void delete(int row,int col){
        arr[row][col]=Integer.MIN_VALUE;
        System.out.println("successfully deleted");
    }

    public static void main(String[]str){
        twoarray key = new twoarray(2,2);
        key.insert(0,0,1);
        key.insert(0,1,2);
        key.insert(1,0,3);
        key.insert(1,1,4);
        key.traverse(2,2);
        key.delete(1,1);
        key.traverse(2,2);
    }
}

