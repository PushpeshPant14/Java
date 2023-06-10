import java.util.*;
public class matrix {
    public static void largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest=Math.max(largest, matrix[i][j]);
                smallest=Math.min(smallest,matrix[i][j]);
            }
        }
        System.out.println("Largest value is "+largest);
        System.out.println("Smallest value is "+smallest);
    }
    public static void search(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("element found at index ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("not found");

    }
   public static void main(String[] args) {
    int matrix[][]=new int [3][3];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }
    
    largest(matrix);
    search(matrix,5);
    sc.close();
   }
}
