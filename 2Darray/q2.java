public class q2 {
    //sum of 2nd row;
    public static void rowsum(int matrix[][]){
        int sum=0;
       for(int i=0;i<matrix[0].length;i++){
        sum+=matrix[1][i];   //row is fixed 
       }
       System.out.println(sum);  
    }
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        rowsum(matrix);
    }
    
}
